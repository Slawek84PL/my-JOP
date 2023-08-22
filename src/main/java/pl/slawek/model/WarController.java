package pl.slawek.model;

import pl.slawek.model.soldiers.Soldier;

import java.util.List;
import java.util.Scanner;

class WarController {
    private Scanner scanner = new Scanner(System.in);
    private final int CORECT_TO_LIST_INDEX = 1;
    private final int DEFOULT_VALUE = 0;
    public void printOptions(Soldier soldier) {

        System.out.println("Co chcesz zrobić?");
        System.out.println("1 - Atak; 2 - przeładuj broń;");
    }

    public Soldier getSoldierToGame(List<Soldier> soldierList) {

        for (int i = 0; i < soldierList.size(); i++) {
            Soldier soldier = soldierList.get(i);
            System.out.printf("%s - %s %s %s zdrowie: %s amunicja %s.\n",
                    i + 1, soldier.getClass().getSimpleName(), soldier.getName(), soldier.getSurname(),soldier.getHealth(), soldier.getWeapon().getAmo());
        }

        return soldierList.get(getPlayerAnswer(soldierList.size()));
    }

    public int getPlayerAnswer(int maxValue) {

        int answer;
        try {
            answer = Integer.parseInt(scanner.nextLine());
            if (answer > maxValue || answer <= 0){
                System.out.println("Podano żołnierza z poza listy. Do walki staje pierwszy na liście.");
                return DEFOULT_VALUE;
            }
        } catch (Exception e) {
            System.out.println("Podano niepoprawny numer żołnierza. Do walki staje pierwszy na liście.");
            return DEFOULT_VALUE;
        }
        return answer - CORECT_TO_LIST_INDEX;
    }
}
