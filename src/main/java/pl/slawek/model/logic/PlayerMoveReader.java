package pl.slawek.model.logic;

import pl.slawek.model.logic.exception.WrongNumberException;

import java.util.Scanner;

public class PlayerMoveReader {
    Scanner scanner = new Scanner(System.in);
    int number;
    public int read(int tableSize) throws WrongNumberException {
        return validateAndParse(scanner.nextLine(), tableSize);
    }

    private int validateAndParse(String input, int tableSize) throws WrongNumberException {
        if (input == null || input.isEmpty()) {
            throw new WrongNumberException("Wybór nie może być pusty.");
        }

        input = input.trim();

        if (!isNumber(input)) {
            throw new WrongNumberException("Wybór musi być cyfrą");
        }

        if (number > tableSize || number <= 0) {
            throw new WrongNumberException(String.format("Wybór musi być większy od 0 i mniejszy od %s", + tableSize + 1));
        }

        return number;
    }

    private boolean isNumber(final String input) {
        try {
            this.number = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
