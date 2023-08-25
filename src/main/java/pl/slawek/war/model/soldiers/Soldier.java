package pl.slawek.war.model.soldiers;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import pl.slawek.war.model.Human;
import pl.slawek.war.model.soldiers.action.ActionList;
import pl.slawek.war.model.soldiers.action.SpecialActions;
import pl.slawek.war.model.soldiers.weapon.Weapon;

@Setter
@ToString(onlyExplicitlyIncluded = true, callSuper = true)
public class Soldier extends Human implements SpecialActions {

    private static int killedEnemies;

    private int myKilledEnemies;

    @Getter
    @ToString.Include
    private String nationality;

    @Getter
    private int health = 10;

    @Getter
    private int amo = 100;

    @Getter
    private Weapon weapon;

    @Getter
    private ActionList actionList = new ActionList();


    public void kill() {
        killedEnemies++;
        myKilledEnemies++;
    }

    public void shot(int amo, Soldier enemy) {
        this.weapon.setAmo(amo);
        enemy.health -= amo;
    }

    @Override
    public void addSpecialActions() {
        this.actionList.addActionToList("Atak");
        this.actionList.addActionToList("Przeładuj broń");
    }

    public void reload() {
        int amoToReload = this.weapon.reload();
        this.amo -= amoToReload;
    }

    public void useSpecialAction(Soldier soldierToGame) {
    }
}
