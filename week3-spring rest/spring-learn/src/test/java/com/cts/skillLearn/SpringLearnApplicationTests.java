package com.cts.skillLearn;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class SpringLearnApplicationTests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetCountry() throws Exception {

        mockMvc.perform(get("/countries/IN"))

                .andExpect(status().isOk())

                .andExpect(jsonPath("$.code").value("IN"))

                .andExpect(jsonPath("$.name").value("India"));

    }

    @Test
    public void testCountryNotFound() throws Exception {

        mockMvc.perform(get("/countries/XYZ"))

                .andExpect(status().isBadRequest());

    }

}