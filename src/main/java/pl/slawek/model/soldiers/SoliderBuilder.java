package pl.slawek.model.soldiers;

import com.github.javafaker.Faker;
import pl.slawek.model.soldiers.weapon.Weapon;

import java.util.Locale;

public class SoliderBuilder {

    Faker faker = new Faker(new Locale("pl"));

    public Soldier build(String teamName) {
        Soldier soldier = new Soldier();
        Weapon weapon = new Weapon();
        weapon.setName(faker.funnyName().name());

        soldier.setName(faker.name().firstName());
        soldier.setSurname(faker.name().lastName());
        soldier.setNationality(teamName);
        soldier.setWeapon(weapon);

        System.out.println(soldier);
        return soldier;
    }
}
