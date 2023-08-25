package pl.slawek.war.model.soldiers;

import lombok.ToString;

@ToString(callSuper = true)
public class Support extends Soldier{

    @ToString.Exclude
    private boolean delivery;

    private int amoToUpdate = 100;

    @Override
    public void addSpecialActions() {
        super.addSpecialActions();
        getActionList().addActionToList("Uzupełnij amo");
    }

    public void useSpecialAction(Soldier soldier) {
        int updateAmo = 100 - soldier.getAmo();
        soldier.setAmo(updateAmo);
        this.amoToUpdate -= updateAmo;
        System.out.printf("%s ma doładowaną amunicję.\n", soldier.getName());
    }

    public void setDelivery() {
        this.delivery = true;
    }
}
