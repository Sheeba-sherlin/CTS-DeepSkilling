package com.cts.controller;

import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;

import com.cts.entity.User;

import com.cts.service.UserService;

@WebMvcTest(UserController.class)

public class UserControllerTest {

    @Autowired

    private MockMvc mockMvc;

    @MockBean

    private UserService userService;

    @Test

    public void testCreateUser() throws Exception {

        User user = new User(1L,"Sheeba");

        when(userService.saveUser(user))

                .thenReturn(user);

        mockMvc.perform(

                post("/users")

                .contentType(MediaType.APPLICATION_JSON)

                .content("""

                        {

                        "id":1,

                        "name":"Sheeba"

                        }

                        """))

                .andExpect(status().isOk())

                .andExpect(jsonPath("$.id").value(1))

                .andExpect(jsonPath("$.name").value("Sheeba"));

    }

}