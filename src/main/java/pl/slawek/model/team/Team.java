package pl.slawek.model.team;

import lombok.ToString;
import pl.slawek.model.soldiers.Soldier;

import java.util.HashSet;
import java.util.Set;

@ToString
public class Team {
    private static int killedEnemies;

    private Set<Soldier> soldiers = new HashSet<>();

    public void setSoldiers(Soldier soldier) {
        soldiers.add(soldier);
    }

    public void setKilledEnemies() {
        killedEnemies++;
    }
}
