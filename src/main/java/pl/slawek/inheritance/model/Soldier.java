package pl.slawek.inheritance.model;

public class Soldier extends Human {
    private static int killedEnemies;
    private int myKilledEnemies;
    private String nationality;

    public Soldier(final String name, final String surname, final int age, final int growth, String nationality) {
        super(name, surname, age, growth);
        this.nationality = nationality;
    }

    public void kill() {
        killedEnemies++;
        myKilledEnemies++;
    }

    @Override
    public String toString() {
        return "Tajne:" +
                " Właśnie zabiłem." +
                " w sumie zabiłem " + myKilledEnemies +
                ", mój kraj to " + nationality +
                ", moja jednostka zabiła w sumie " + killedEnemies;
    }
}
