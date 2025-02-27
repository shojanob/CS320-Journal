import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ContactTest {
    @Test
    public void testValidContact() {
        Contact contact = new Contact("12345", "Shoh", "Janobilov", "1453029490", "1400 West Bank St");
        assertEquals("12345", contact.getContactId());
        assertEquals("Shoh", contact.getFirstName());
        assertEquals("Janobilov", contact.getLastName());
        assertEquals("1453029490", contact.getPhone());
        assertEquals("1400 West Bank St", contact.getAddress());
    }

    @Test
    public void testInvalidContactId() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Shoh", "Janob", "1234567890", "123 Main St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St"));
    }

    @Test
    public void testSetters() {
        Contact contact = new Contact("12345", "John", "Doe", "1234567890", "123 Main St");
        contact.setFirstName("Marcus");
        contact.setLastName("Rashford");
        contact.setPhone("0987654321");
        contact.setAddress("456 Mary St");

        assertEquals("Marcus", contact.getFirstName());
        assertEquals("Rashford", contact.getLastName());
        assertEquals("0987654321", contact.getPhone());
        assertEquals("456 Mary St", contact.getAddress());
    }
}
