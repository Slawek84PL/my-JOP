package pl.slawek.model.soldiers;

import com.github.javafaker.Faker;
import pl.slawek.model.soldiers.weapon.Weapon;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SoliderBuilder {

    Faker faker;

    public List<Soldier> build(String teamName, String locale) {
        faker = new Faker(new Locale(locale));

        List<Soldier> tempSoldiersList = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            tempSoldiersList.add(new Soldier());
        }

        tempSoldiersList.add(new Medic());
        tempSoldiersList.add(new Support());

        for (Soldier soldier : tempSoldiersList) {
            soldier.setName(faker.name().firstName());
            soldier.setSurname(faker.name().lastName());
            soldier.setNationality(teamName);
            soldier.setWeapon(createWeapon());
            sayHello(soldier);
        }

        return tempSoldiersList;
    }

    private Weapon createWeapon() {
        Weapon weapon = new Weapon();
        weapon.setName(faker.funnyName().name());
        return weapon;
    }

    private void sayHello(final Soldier soldier) {
        System.out.printf("%s %s %s zostaje powołany do słuzby.\n",
                soldier.getClass().getSimpleName(),
                soldier.getName().toUpperCase(Locale.ROOT),
                soldier.getSurname().toUpperCase());
    }
}
