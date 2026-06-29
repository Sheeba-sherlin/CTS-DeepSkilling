package com.cts;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cts.entity.User;
import com.cts.service.UserService;

@SpringBootTest
public class IntegrationTest {

    @Autowired
    private UserService service;

    @Test
    public void testIntegration() {

        User user = new User(1L, "Sheeba");

        service.saveUser(user);

        User result = service.getUser(1L);

        assertEquals("Sheeba", result.getName());

    }

}