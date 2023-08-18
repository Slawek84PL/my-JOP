package pl.slawek.model.soldiers;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import pl.slawek.model.Human;
import pl.slawek.model.soldiers.weapon.Weapon;

@Setter
@ToString(onlyExplicitlyIncluded = true, callSuper = true)
public class Soldier extends Human {

    private static int killedEnemies;

    private int myKilledEnemies;

    @Getter
    @ToString.Include
    private String nationality;

    @Getter
    private int health = 10;

    @Getter
    private Weapon weapon;

    public void kill() {
        killedEnemies++;
        myKilledEnemies++;
    }
}
