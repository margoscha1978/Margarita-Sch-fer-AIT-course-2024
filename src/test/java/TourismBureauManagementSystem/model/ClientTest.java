package TourismBureauManagementSystem.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void testClientRegistration() {
        Client client = new Client("John", "Doe", "john.doe@example.com");
        assertEquals("John", client.getFirstName());
    }

    @Test
    void testUpdateContactInfo() {
        Client client = new Client("Jane", "Doe", "jane.doe@example.com");
        client.updateContactInfo("jane.new@example.com");
        assertEquals("jane.new@example.com", client.getContactInfo());
    }
} // test ended