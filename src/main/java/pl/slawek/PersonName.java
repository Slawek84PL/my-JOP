package pl.slawek;

import java.util.Locale;

class PersonName {
    private String name;
    private char sex;
    private char sexSymbol;

    private boolean checkName(String nameForCheck) {
        String[] splitName = nameForCheck.split("[^A-Za-zżźćńółęąśŻŹĆĄŚĘŁÓŃ]");

        String tempName = "";
        for (int i = 0; i < splitName.length; i++) {
            tempName = tempName.concat(splitName[i]);
        }

        if (tempName.length() > 1) {
            name = tempName;
            return true;
        }
        return false;
    }

    private void checkGender() {
        if (name.endsWith("a")) {
            this.sex = 75;
            this.sexSymbol = 9792;
        } else {
            this.sex = 77;
            this.sexSymbol = 9794;
        }
    }
    private void printNameAsColumn() {
        System.out.println("Twoje imię zapisane w kolumne wielkimi literami:");
        for (char letter : name.toCharArray()) {
            System.out.println(String.valueOf(letter).toUpperCase(Locale.ROOT));
        }
    }

    private void printInfoAboutName() {
        System.out.printf("Twoje name ma %s znaków\n", name.length());

        System.out.printf("Jesteś płci %s. Znak twojej płci to %s\n", sex, sexSymbol);
    }
}
