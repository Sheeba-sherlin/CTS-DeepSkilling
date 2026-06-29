package com.cts.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cts.entity.User;
import com.cts.repository.UserRepository;

public class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    public UserServiceTest() {

        MockitoAnnotations.openMocks(this);

    }

    @Test
    public void testGetUserById() {

        // Arrange
        User user = new User(1L, "Sheeba");

        when(userRepository.findById(1L))
                .thenReturn(Optional.of(user));

        // Act
        User result = userService.getUserById(1L);

        // Assert
        assertEquals("Sheeba", result.getName());

    }

}