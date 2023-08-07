package pl.slawek.inheritance.model;

public class Chef extends Human {
    public Chef(final String name, final String surname, final int age, final int growth) {
        super(name, surname, age, growth);
    }

    @Override
    public String eat() {
        return super.eat() + ". But, I eat only the best dishes";
    }
}
