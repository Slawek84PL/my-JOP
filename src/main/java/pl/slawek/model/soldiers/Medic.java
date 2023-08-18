package pl.slawek.model.soldiers;

import lombok.ToString;

@ToString(callSuper = true)
public class Medic extends Soldier{

    @ToString.Exclude
    private boolean rescue;

    public void setRescue() {
        this.rescue = true;
    }
}
