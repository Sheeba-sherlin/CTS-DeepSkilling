package com.cts.service;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import java.util.NoSuchElementException;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import com.cts.repository.UserRepository;

public class UserServiceTest {

    @Mock
    private UserRepository repository;

    @InjectMocks
    private UserService service;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testUserNotFound() {

        when(repository.findById(1L))
                .thenReturn(Optional.empty());

        assertThrows(NoSuchElementException.class, () -> {

            service.getUserById(1L);

        });

    }

}