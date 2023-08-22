package pl.slawek.starters;

import pl.slawek.model.Batlefield;
import pl.slawek.model.team.TeamBuilder;

public class War {

    private static final TeamBuilder teamBuilder = new TeamBuilder();
    private static final Batlefield batlefield = new Batlefield();
    private static final int SHOOTER_TEAM = 0;
    private static final int ENEMY_TEAM = 1;

    public static void main(String[] args) {
        teamBuilder.build();

        do {
                batlefield.fight(teamBuilder.getTeams(), SHOOTER_TEAM, ENEMY_TEAM, false);

                System.out.println("\nKontratak wroga");

                batlefield.fight(teamBuilder.getTeams(), ENEMY_TEAM, SHOOTER_TEAM, true);

        } while (!teamBuilder.getTeams().get(0).getSoldiers().isEmpty() && !teamBuilder.getTeams().get(1).getSoldiers().isEmpty());

        System.out.println(teamBuilder.getTeams().get(0).getSoldiers().size());
        System.out.println(teamBuilder.getTeams().get(1).getSoldiers().size());
        System.out.println(batlefield.getTeamOfTheDead().soldiers.toString());
    }


}
