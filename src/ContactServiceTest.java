import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ContactServiceTest
{
    @Test
    public void testAddContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("55555", "Lionel", "Messi", "1234567890", "3456 Chester St");
        service.addContact(contact);
        assertEquals(contact, service.getContact("55555"));
    }

    @Test
    public void testDeleteContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("55555", "Lionel", "Messi", "1234567890", "3456 Chester St");
        service.addContact(contact);
        service.deleteContact("55555");
        assertNull(service.getContact("55555"));
    }

    @Test
    public void testUpdateContact() {
        ContactService service = new ContactService();
        Contact contact = new Contact("55555", "Lionel", "Messi", "1234567890", "3456 Chester St");
        service.addContact(contact);
        service.updateContact("12345", "Jane", null, null, "456 Elm St");

        assertEquals("Jane", service.getContact("12345").getFirstName());
        assertEquals("456 Elm St", service.getContact("12345").getAddress());
    }
}
