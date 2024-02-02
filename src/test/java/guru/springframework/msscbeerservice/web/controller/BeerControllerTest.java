package guru.springframework.msscbeerservice.web.controller;

import guru.springframework.msscbeerservice.web.model.BeerDto;
import guru.springframework.msscbeerservice.web.model.BeerStyleEnum;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.testcontainers.shaded.com.fasterxml.jackson.databind.ObjectMapper;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import javax.swing.*;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@WebMvcTest(BeerController.class)
class BeerControllerTest {
    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void saveNewBeer() throws Exception {
        BeerDto beerDto = BeerDto.builder()
                .beerName("corona")
                .beerStyle(BeerStyleEnum.ALE)
                .build();

        mockMvc.perform(post("/api/v1/beer/").content(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());


    }

    @Test
    void getBeerById() throws Exception {
        mockMvc.perform(post("/api/v1/beer/"+ UUID.randomUUID().toString()).content(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());
    }

    @Test
    void updateBeer() throws Exception {
        mockMvc.perform(post("/api/v1/beer/"+ UUID.randomUUID().toString()).content(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());
    }
}