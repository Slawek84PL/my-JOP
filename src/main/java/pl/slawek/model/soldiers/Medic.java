package pl.slawek.model.soldiers;

class Medic extends Soldier{

    private boolean rescue;

    public Medic(final String name, final String surname, final int age, final int growth, final String nationality) {
        super(name, surname, age, growth, nationality);
    }

    public void setRescue() {
        this.rescue = true;
    }
}
