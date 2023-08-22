package pl.slawek.model.team;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pl.slawek.model.soldiers.Soldier;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@ToString
public class Team {
    private static int killedEnemies;

    private List<Soldier> soldiers = new LinkedList<>();

    public void setKilledEnemies() {
        killedEnemies++;
    }
}
