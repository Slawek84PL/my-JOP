package pl.slawek;

import org.junit.Test;
import pl.slawek.war.model.PersonName;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NameCheckerTest {

    @Test
    public void shouldClearStringWithoutProhibitedCharacters() {

        PersonName personName = new PersonName();

        String string = "Imię";
        String stringWithNumbers = "12Imię";
        String onlyNumbers = "1234";
        String emptyString = "";
        String toShort = "a";
        int number = 1;

        assertTrue(personName.checkName(string));
        assertTrue(personName.checkName(stringWithNumbers));
        assertFalse(personName.checkName(onlyNumbers));
        assertFalse(personName.checkName(emptyString));
        assertFalse(personName.checkName(toShort));
        assertFalse(personName.checkName(String.valueOf(number)));
    }

}