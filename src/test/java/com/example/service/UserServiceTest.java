package com.example.service;

import com.example.model.User;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserServiceTest {
    private UserService userService;

    @Before
    public void setUp() {
        userService = new UserService();
    }

    @Test
    public void testAddUser() {
        User user = new User("1", "John Doe", "john.doe@example.com");
        userService.addUser(user);
        assertEquals(1, userService.getAllUsers().size());
    }

    @Test
    public void testGetUser() {
        User user = new User("1", "John Doe", "john.doe@example.com");
        userService.addUser(user);
        User retrievedUser = userService.getUser("1");
        assertNotNull(retrievedUser);
        assertEquals("John Doe", retrievedUser.getName());
    }
}
