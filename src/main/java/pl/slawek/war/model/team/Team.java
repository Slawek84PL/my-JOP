package pl.slawek.war.model.team;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pl.slawek.war.model.soldiers.Soldier;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@ToString
public class Team {
    private static int killedEnemies;
    private String name;

    private List<Soldier> soldiers = new LinkedList<>();

    public void setKilledEnemies() {
        killedEnemies++;
    }
}
