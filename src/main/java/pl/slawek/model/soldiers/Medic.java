package pl.slawek.model.soldiers;

import lombok.ToString;

@ToString(callSuper = true)
public class Medic extends Soldier{

    @ToString.Exclude
    private boolean rescue;

    @Override
    public void addSpecialActions() {
        super.addSpecialActions();
        getActionList().addActionToList("Lecz");
    }

    public void setRescue() {
        this.rescue = true;
    }
}
