package pl.slawek.war.logic.war;

import lombok.Getter;
import pl.slawek.war.model.soldiers.Soldier;
import pl.slawek.war.model.team.Team;
import pl.slawek.war.model.team.TeamOfTheDead;

import java.util.List;
import java.util.Random;

public class Batlefield {

    @Getter
    private final TeamOfTheDead teamOfTheDead = new TeamOfTheDead();
    private final WarController warController = new WarController();

    public void fight(List<Team> teams, int shooterTeam, int enemyTeam, boolean auto) {
        Soldier shooter = null;
        Soldier enemy = null;
        Soldier soldierHelp = null;
        int action;

        if (checkTeams(teams)) {
            if (auto) {
                int shooterInt = new Random().nextInt(0, teams.get(shooterTeam).getSoldiers().size());
                int enemyInt = new Random().nextInt(0, teams.get(enemyTeam).getSoldiers().size());
                int forHelpInt = new Random().nextInt(0, teams.get(shooterTeam).getSoldiers().size());

                shooter = teams.get(shooterTeam).getSoldiers().get(shooterInt);
                action = new Random().nextInt(0, shooter.getActionList().getActionList().size());
                enemy = teams.get(enemyTeam).getSoldiers().get(enemyInt);
                soldierHelp = teams.get(shooterTeam).getSoldiers().get(forHelpInt);
            } else {
                System.out.println("\nWybierz żołnierza do ataku");
                shooter = warController.getSoldierToGame(teams.get(shooterTeam).getSoldiers());
                action = warController.getShooterAction(shooter);
            }

            switch (action) {
                case 0: 
                    if (enemy == null) {
                        System.out.println("\nWybierz żołnierza którego chcesz zaatakować");
                        enemy = warController.getSoldierToGame(teams.get(enemyTeam).getSoldiers());
                    }
                    atack(teams.get(enemyTeam), shooter, enemy);
                    break;
                case 1:
                    shooter.reload();
                    System.out.printf("%s przeładowuje broń\n", shooter.getName());
                    break;
                case 2:
                    if (soldierHelp == null) {
                        System.out.println("Wybierz żołnierza, któremu chcesz pomóc");
                        soldierHelp = warController.getSoldierToGame(teams.get(shooterTeam).getSoldiers());
                    }
                    shooter.useSpecialAction(soldierHelp);
                    break;
            }
            
        } else {
            System.out.println("Koniec rozgrywki");
            int winner = enemyTeam;
            if (teams.get(shooterTeam).getSoldiers().size() > teams.get(shooterTeam).getSoldiers().size()) {
                winner = shooterTeam;
            }
            System.out.printf("Wygrywa zespół %s", teams.get(winner).getName());
        }
    }

    private void atack(Team enemyTeam, Soldier shooter, Soldier enemy) {
        System.out.printf("\nAtak: %s %s z drużyny %s.\n", shooter.getName(), shooter.getSurname(), shooter.getNationality());
        System.out.printf("Obrona: %s %s z drużyny %s.\n", enemy.getName(), enemy.getSurname(), enemy.getNationality());

        int amoShot = cheskShooterWeapon(shooter.getWeapon().getAmo());

        if (amoShot > 0) {

            shooter.shot(amoShot, enemy);

            System.out.printf("%s trafia %s %s razy.\n", shooter.getName(), enemy.getName(), amoShot);

            checkEnemyHealth(enemyTeam, enemy);
        } else {
            System.out.printf("Niestety %s ma pusty magazynek.\n", shooter.getName());
        }
    }

    private boolean checkTeams(List<Team> teams) {
        for (Team team : teams) {
            if (team.getSoldiers().isEmpty()) {
                System.out.printf("Wszyscy w zespole %s nieżyją\n", team.getName());
                return false;
            }
        }
        return true;
    }

    private int cheskShooterWeapon(int amoInWeapon) {
        switch (amoInWeapon) {
            case 0, 1 -> {}
            default -> amoInWeapon = new Random().nextInt(1, amoInWeapon);
        }
        return amoInWeapon;
    }

    private void checkEnemyHealth(Team team, final Soldier soldier) {
        if (soldier.getHealth() <= 0) {
            System.out.printf("Przeciwnik %s %s umiera i trafia na listę trupów.\n", soldier.getName(), soldier.getSurname());
            team.getSoldiers().remove(soldier);
            teamOfTheDead.soldiers.push(soldier);
        }

    }
}
