package pl.slawek.model.team;

import lombok.Getter;
import lombok.ToString;
import pl.slawek.model.soldiers.SoliderBuilder;

import java.util.*;

@ToString
public class TeamBuilder {
    @Getter
    private List<Team> teams = new ArrayList<>();
    private SoliderBuilder soliderBuilder = new SoliderBuilder();

    public void build() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe twojej drużyny");
        String teamName = scanner.nextLine();

        Team team = new Team();
        for (int i = 0; i < 4; i++) {
            team.setSoldiers(soliderBuilder.build(teamName));
        }
        teams.add(team);
    }
}
