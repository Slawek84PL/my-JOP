package pl.slawek.model.soldiers;

import lombok.ToString;

@ToString(callSuper = true)
public class Support extends Soldier{

    @ToString.Exclude
    private boolean delivery;

    @Override
    public void addSpecialActions() {
        super.addSpecialActions();
        getActionList().addActionToList("Uzupełnij amo");
    }

    public void setDelivery() {
        this.delivery = true;
    }
}
