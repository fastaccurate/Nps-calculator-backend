package com.example.npscalculator.controller;

import com.example.npscalculator.model.Investment;
import com.example.npscalculator.service.InvestmentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class InvestmentControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void calculateNps() throws Exception {
        Investment investment = new Investment(5000, 8, 30);

        mockMvc.perform(post("/api/nps/calculate")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(investment)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.totalInvestment").value(1800000))
                .andExpect(jsonPath("$.interestEarned").value(1153604.57))
                .andExpect(jsonPath("$.maturityAmount").value(2953604.57))
                .andExpect(jsonPath("$.minimumAnnualInvestment").value(6000));
    }
}
