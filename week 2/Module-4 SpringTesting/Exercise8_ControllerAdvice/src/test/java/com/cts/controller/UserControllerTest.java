package com.cts.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.cts.exception.GlobalExceptionHandler;
import com.cts.service.UserService;

@WebMvcTest(UserController.class)
@Import(GlobalExceptionHandler.class)
public class UserControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    UserService service;

    @Test
    public void testExceptionHandling() throws Exception {

        when(service.getUserById(1L))
                .thenThrow(new NoSuchElementException());

        mockMvc.perform(get("/users/1"))

                .andExpect(status().isNotFound())

                .andExpect(content().string("User not found"));

    }

}