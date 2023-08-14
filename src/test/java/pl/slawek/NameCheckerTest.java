package pl.slawek;

import org.junit.Test;
import pl.slawek.starters.NameChecker;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NameCheckerTest {

    @Test
    public void shouldClearStringWithoutProhibitedCharacters() {

        String string = "Imię";
        String stringWithNumbers = "12Imię";
        String onlyNumbers = "1234";
        String emptyString = "";
        String toShort = "a";
        int number = 1;

        assertTrue(NameChecker.checkName(string));
        assertTrue(NameChecker.checkName(stringWithNumbers));
        assertFalse(NameChecker.checkName(onlyNumbers));
        assertFalse(NameChecker.checkName(emptyString));
        assertFalse(NameChecker.checkName(toShort));
        assertFalse(NameChecker.checkName(String.valueOf(number)));
    }

}