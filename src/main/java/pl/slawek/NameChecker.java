package pl.slawek;

import java.util.Scanner;

public class NameChecker
{
    private static final String HELLO = "Witaj";
    private static final PersonName personName = new PersonName();

    public static void main( String[] args ){
        do {
            getNameFromUser();
        } while (personName.getName() == null);

        printInfoAboutName();
        personName.printNameAsColumn();
    }

    private static void getNameFromUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj swoje imię:");
        String tempName = scanner.nextLine();

        if (tempName.isEmpty() || !personName.checkName(tempName)) {
            System.out.printf("%s nie wygląda to na imię człowieka\n", tempName);
        }
    }

    private static void printInfoAboutName() {
        System.out.printf("%s %s.\n", HELLO, personName.getName());
        personName.printInfoAboutName();
    }


}
