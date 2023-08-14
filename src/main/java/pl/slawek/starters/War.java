package pl.slawek.starters;

import pl.slawek.model.soldiers.Medic;
import pl.slawek.model.soldiers.Soldier;
import pl.slawek.model.soldiers.Support;
import pl.slawek.model.team.Team;

public class War {

    private static final Team myTeam = new Team();
    private static final Team enemyTeam = new Team();

    public static void main(String[] args) {
        Soldier myMedic = new Medic("Lekarz", "Leczący", 20, 185, "PL");
        Soldier mySupport = new Support("Wsparcie", "Amo", 21, 175, "PL");
        Soldier mySoldier = new Soldier("Żołnierz", "Zabijający", 21, 175, "PL");

        myTeam.setSoldiers(myMedic);
        myTeam.setSoldiers(mySupport);
        myTeam.setSoldiers(mySoldier);

        Soldier enemyMedic = new Medic("Lekarz", "Leczący", 20, 185, "RUS");
        Soldier enemySupport = new Support("Wsparcie", "Amo", 21, 175, "RUS");
        Soldier enemySoldier = new Soldier("Żołnierz", "Zabijający", 21, 175, "RUS");

        enemyTeam.setSoldiers(enemyMedic);
        enemyTeam.setSoldiers(enemySupport);
        enemyTeam.setSoldiers(enemySoldier);

        System.out.println(myTeam);
        System.out.println(enemyTeam);
    }
}
