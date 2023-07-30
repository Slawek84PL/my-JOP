package pl.slawek;

import java.util.Locale;
import java.util.Scanner;

public class NameChecker
{
    private static final String HELLO = "Witaj";
    private static String name;
    private static char sex;
    private static char sexSymbol;

    public static void main( String[] args )
    {
        do {
            getNameForHello();
        } while (name == null);

        checkGender();
        printInfoAboutName();
        printNameAsColumn();
    }

    private static void getNameForHello() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imię:");
        String tempName = scanner.nextLine();

        if (tempName.isEmpty() || !checkName(tempName)) {
            System.out.printf("%s nie wygląda to na imię człowieka\n", tempName);
        }
    }

    private static boolean checkName(String nameForCheck) {
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

    private static void checkGender() {
        if (name.endsWith("a")) {
            sex = 75;
            sexSymbol = 9792;
        } else {
            sex = 77;
            sexSymbol = 9794;
        }
    }

    private static void printInfoAboutName() {
        System.out.printf("%s %s.\n", HELLO, name);

        System.out.printf("Twoje name ma %s znaków\n", name.length());

        System.out.printf("Jesteś płci %s. Znak twojej płci to %s\n", sex, sexSymbol);
    }

    private static void printNameAsColumn() {
        System.out.println("Twoje imię zapisane w kolumne wielkimi literami:");
        for (char letter : name.toCharArray()) {
            System.out.println(String.valueOf(letter).toUpperCase(Locale.ROOT));
        }
    }
}
