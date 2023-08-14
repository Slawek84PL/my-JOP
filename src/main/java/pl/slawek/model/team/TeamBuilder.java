package pl.slawek.model.team;

import lombok.ToString;
import pl.slawek.model.soldiers.Medic;
import pl.slawek.model.soldiers.Soldier;
import pl.slawek.model.soldiers.Support;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@ToString
public class TeamBuilder {

    List<Team> teams = new ArrayList<>();

    public void build() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe twojej drużyny");
        String teamName = scanner.nextLine();

        Team team = new Team();
        team.setSoldiers(new Medic("Lekarz", "Leczący", 20, 185, teamName));
        team.setSoldiers(new Support("Wsparcie", "Amo", 21, 175, teamName));
        team.setSoldiers(new Soldier("Żołnierz", "Zabijający", 21, 175, teamName));
        teams.add(team);
    }
}
