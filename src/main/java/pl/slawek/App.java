package pl.slawek;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String imie = scanner.nextLine();

        String hello = "Witaj";
        System.out.printf("%s %s.\n", hello, imie);
    }
}
