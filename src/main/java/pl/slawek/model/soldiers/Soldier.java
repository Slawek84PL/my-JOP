package pl.slawek.model.soldiers;

import lombok.ToString;
import pl.slawek.model.Human;

@ToString(onlyExplicitlyIncluded = true, callSuper = true)
public class Soldier extends Human {
    private static int killedEnemies;
    private int myKilledEnemies;
    @ToString.Include
    private String nationality;

    public Soldier(final String name, final String surname, final int age, final int growth, String nationality) {
        super(name, surname, age, growth);
        this.nationality = nationality;
    }

    public void kill() {
        killedEnemies++;
        myKilledEnemies++;
    }
}
