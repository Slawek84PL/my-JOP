package pl.slawek.model.logic.war;

import pl.slawek.model.logic.PlayerMoveReader;
import pl.slawek.model.logic.exception.WrongNumberException;
import pl.slawek.model.soldiers.Soldier;
import pl.slawek.model.soldiers.action.ActionList;

import java.util.List;

class WarController {
    private PlayerMoveReader playerMoveReader = new PlayerMoveReader();
    private final int CORECT_TO_LIST_INDEX = 1;
    private final int DEFOULT_VALUE = 0;
    int getShooterAction(final Soldier shooter) {
        printOptions(shooter.getActionList());
        return getPlayerAnswer(shooter.getActionList().getActionList().size());
    }

    void printOptions(ActionList actionList) {
        for (int i = 0; i < actionList.getActionList().size(); i++) {
            System.out.printf("%s", actionList.getActionList().get(i));
            // TODO: 2023-08-25 zrobić iterację po hashMap i wyświetlić wszystkie opcje 
        }
    }

    Soldier getSoldierToGame(List<Soldier> soldierList) {

        for (int i = 0; i < soldierList.size(); i++) {
            Soldier soldier = soldierList.get(i);
            System.out.printf("%s - %s %s %s zdrowie: %s amunicja %s.\n",
                    i + CORECT_TO_LIST_INDEX, soldier.getClass().getSimpleName(),
                    soldier.getName(), soldier.getSurname(),soldier.getHealth(),
                    soldier.getWeapon().getAmo());
        }

        return soldierList.get(getPlayerAnswer(soldierList.size()));
    }

    int getPlayerAnswer(int maxValue) {
        try {
            return  playerMoveReader.read(maxValue) - CORECT_TO_LIST_INDEX;
        } catch (WrongNumberException e) {
            System.err.println(e.getMessage());
        }
        System.out.println("Zastosowany zostaje wybór pierwszy z listy.");
        return DEFOULT_VALUE;
    }
}
