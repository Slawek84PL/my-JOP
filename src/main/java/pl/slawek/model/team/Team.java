package pl.slawek.model.team;

import lombok.Getter;
import lombok.ToString;
import pl.slawek.model.soldiers.Soldier;

import java.util.LinkedList;
import java.util.List;

@ToString
public class Team {
    private static int killedEnemies;

    @Getter
    private List<Soldier> soldiers = new LinkedList<>();

    public void setSoldiers(Soldier soldier) {
        soldiers.add(soldier);
    }

    public void setKilledEnemies() {
        killedEnemies++;
    }
}
