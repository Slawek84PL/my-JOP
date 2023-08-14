package pl.slawek.model.soldiers;

class Support extends Soldier{

    private boolean delivery;

    public Support(final String name, final String surname, final int age, final int growth, final String nationality) {
        super(name, surname, age, growth, nationality);
    }

    public void setDelivery() {
        this.delivery = true;
    }
}
