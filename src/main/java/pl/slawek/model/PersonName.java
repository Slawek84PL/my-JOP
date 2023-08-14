package pl.slawek.model;

import lombok.AccessLevel;
import lombok.Getter;

import java.util.Locale;

@Getter
public class PersonName {
    private String name;

    @Getter(AccessLevel.PRIVATE)
    private char sex;

    @Getter(AccessLevel.PRIVATE)
    private char sexSymbol;

    public boolean checkName(String nameForCheck) {
        String[] splitName = nameForCheck.split("[^A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ]");

        String tempName = "";
        for (int i = 0; i < splitName.length; i++) {
            tempName = tempName.concat(splitName[i]);
        }

        if (tempName.length() > 1) {
            this.name = tempName;
            setGender();
            return true;
        }
        return false;
    }

    private void setGender() {
        if (name.endsWith("a")) {
            this.sex = 75;
            this.sexSymbol = 9792;
        } else {
            this.sex = 77;
            this.sexSymbol = 9794;
        }
    }
    public void printNameAsColumn() {
        System.out.println("Twoje imię zapisane w kolumne wielkimi literami:");
        for (char letter : name.toCharArray()) {
            System.out.println(String.valueOf(letter).toUpperCase(Locale.ROOT));
        }
    }

    public void printInfoAboutName() {
        System.out.printf("Twoje name ma %s znaków\n", name.length());

        System.out.printf("Jesteś płci %s. Znak twojej płci to %s\n", sex, sexSymbol);
    }
}
