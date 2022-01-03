package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NormalUserTest {

    @Test
    void testGetUserEmail() {
        User user = new NormalUser("tjakab@gmail.com", "1234sd");
        assertEquals("tjakab@gmail.com", user.getUserEmail());
    }

    @Test
    void testGetPassword() {
        User user = new NormalUser("tjakab@gmail.com", "1234sd");
        assertEquals("1234sd", user.getPassword());
    }
}