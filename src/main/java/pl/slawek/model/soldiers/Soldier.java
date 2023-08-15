package pl.slawek.model.soldiers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import pl.slawek.model.Human;
import pl.slawek.model.soldiers.weapon.Weapon;

@NoArgsConstructor
@Setter
@ToString(onlyExplicitlyIncluded = true, callSuper = true)
public class Soldier extends Human {

    private static int killedEnemies;

    private int myKilledEnemies;

    @ToString.Include
    private String nationality;

    private int health = 100;

    @Getter
    private Weapon weapon;

    public Soldier(final String name, final String surname, final int age, final int growth, String nationality) {
        super(name, surname, age, growth);
        this.nationality = nationality;
    }

    public void kill() {
        killedEnemies++;
        myKilledEnemies++;
    }
}
