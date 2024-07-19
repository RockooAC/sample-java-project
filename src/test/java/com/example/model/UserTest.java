package com.example.model;

import org.junit.Test;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void testUserCreation() {
        User user = new User("1", "John Doe", "john.doe@example.com");
        assertEquals("1", user.getId());
        assertEquals("John Doe", user.getName());
        assertEquals("john.doe@example.com", user.getEmail());
    }
}
