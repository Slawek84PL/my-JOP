package pl.slawek.model.team;

import lombok.Getter;
import lombok.ToString;
import pl.slawek.model.soldiers.SoliderBuilder;

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
        myTeam.getSoldiers().addAll(soliderBuilder.build(teamName, "pl"));
        teams.add(myTeam);

        System.out.println("\nPo stronie wroga walczą:");

        Team enemyTeam = new Team();
        enemyTeam.getSoldiers().addAll(soliderBuilder.build("Wróg", "de-AT"));
        teams.add(enemyTeam);
    }
}
