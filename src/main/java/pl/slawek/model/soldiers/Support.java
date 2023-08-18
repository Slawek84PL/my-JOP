package pl.slawek.model.soldiers;

import lombok.ToString;

@ToString(callSuper = true)
public class Support extends Soldier{

    @ToString.Exclude
    private boolean delivery;

    public void setDelivery() {
        this.delivery = true;
    }
}
