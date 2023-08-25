package pl.slawek.model.soldiers;

import lombok.ToString;

@ToString(callSuper = true)
public class Medic extends Soldier{

    @ToString.Exclude
    private boolean rescue;

    private int ad = 100;

    @Override
    public void addSpecialActions() {
        super.addSpecialActions();
        getActionList().addActionToList("Lecz");
    }
    
    public void useSpecialAction(Soldier soldier) {
        int updateHealth = 100 - soldier.getHealth();
        soldier.setHealth(updateHealth);
        this.ad -= updateHealth;
        System.out.printf("%s zostaje uleczony\n", soldier.getName());
    }

    public void setRescue() {
        this.rescue = true;
    }
}
