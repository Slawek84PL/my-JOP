package pl.slawek.war.model.team;

import lombok.Getter;
import lombok.ToString;
import pl.slawek.war.model.soldiers.SoliderBuilder;

import java.util.*;

@ToString
public class TeamBuilder {
    @Getter
    private List<Team> teams = new ArrayList<>();
    private final SoliderBuilder soliderBuilder = new SoliderBuilder();

    public void build() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe twojej drużyny");
        String teamName = scanner.nextLine();

        Team myTeam = new Team();
        myTeam.setName(teamName);
        myTeam.getSoldiers().addAll(soliderBuilder.build(teamName, "pl", "\u001B[32m"));
        teams.add(myTeam);

        System.out.println("\nPo stronie wroga walczą:");

        Team enemyTeam = new Team();
        enemyTeam.setName("Wróg");
        enemyTeam.getSoldiers().addAll(soliderBuilder.build("Wróg", "de-AT", "\u001B[31m"));
        teams.add(enemyTeam);
    }
}
