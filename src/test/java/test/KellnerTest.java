package test;

import org.junit.jupiter.api.Test;

import vorlage.Kellner;

import static org.junit.jupiter.api.Assertions.*;

public class KellnerTest {

    @Test
    public void testKellnerConstructor() throws Exception {
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        assertEquals("Anna Schmidt", kellner.getName());
        assertEquals(101, kellner.getMitarbeiterID());
    }

    @Test
    public void testSetName() throws Exception {
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        kellner.setName("Peter Müller");
        assertEquals("Peter Müller", kellner.getName());
    }

    @Test
    public void testSetKellnerID() throws Exception {
        Kellner kellner = new Kellner("Anna Schmidt", 101);
        kellner.setMitarbeiterID(102);
        assertEquals(102, kellner.getMitarbeiterID());
    }
}
