package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import vorlage.TestPerson;

public class PersonTest {

    @Test
    public void testValidName() {
        try {
            TestPerson person = new TestPerson("Maximilian");
            assertEquals("Maximilian", person.name);
        } catch (Exception e) {
            fail("Es sollte keine Exception geworfen werden: " + e.getMessage());
        }
    }

    @Test
    public void testNameTooShort() {
        Exception exception = assertThrows(Exception.class, () -> {
            new TestPerson("Max");
        });
        assertEquals("Der Name der Person muss mindestens 5 Zeichen enthalten!", exception.getMessage());
    }

    @Test
    public void testExactFiveCharacters() {
        try {
            TestPerson person = new TestPerson("Julia");
            assertEquals("Julia", person.name);
        } catch (Exception e) {
            fail("Es sollte keine Exception geworfen werden: " + e.getMessage());
        }
    }
}
