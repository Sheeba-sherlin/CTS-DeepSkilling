package com.cts.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.cts.entity.User;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository repository;

    @Test
    public void testFindByName() {

        repository.save(new User(1L, "Sheeba"));
        repository.save(new User(2L, "John"));
        repository.save(new User(3L, "Sheeba"));

        List<User> users = repository.findByName("Sheeba");

        assertEquals(2, users.size());

    }

}