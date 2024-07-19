package com.example.controller;

import com.example.model.User;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserControllerTest {
    private UserController userController;

    @Before
    public void setUp() {
        userController = new UserController();
    }

    @Test
    public void testCreateUser() {
        userController.createUser("1", "John Doe", "john.doe@example.com");
        User user = userController.getUser("1");
        assertNotNull(user);
        assertEquals("John Doe", user.getName());
    }
}
