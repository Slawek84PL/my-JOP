package pl.slawek.model.soldiers;

import lombok.ToString;

@ToString(callSuper = true)
public class Support extends Soldier{

    @ToString.Exclude
    private boolean delivery;

    public Support(final String name, final String surname, final int age, final int growth, final String nationality) {
        super(name, surname, age, growth, nationality);
    }

    public void setDelivery() {
        this.delivery = true;
    }
}
