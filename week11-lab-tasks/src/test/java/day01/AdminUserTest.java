package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdminUserTest {

    @Test
    void testGetUserEmail() {
        User user = new AdminUser("tjakab@gmail.com", "1234sd");
        assertEquals("tjakab@gmail.com", user.getUserEmail());
    }

    @Test
    void testGetPassword() {
        User user = new AdminUser("tjakab@gmail.com", "1234sd");
        assertEquals("******", user.getPassword());
    }
}