package pl.slawek.model.soldiers;

import lombok.ToString;

@ToString(callSuper = true)
public class Medic extends Soldier{

    @ToString.Exclude
    private boolean rescue;

    public Medic(final String name, final String surname, final int age, final int growth, final String nationality) {
        super(name, surname, age, growth, nationality);
    }

    public void setRescue() {
        this.rescue = true;
    }
}
