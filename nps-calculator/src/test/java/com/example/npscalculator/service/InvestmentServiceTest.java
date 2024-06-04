package com.example.npscalculator.service;

import com.example.npscalculator.model.Investment;
import com.example.npscalculator.model.InvestmentResult;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InvestmentServiceTest {

    private final InvestmentService investmentService = new InvestmentService();

    @Test
    void calculateNps() {
        Investment investment = new Investment(5000, 8, 30);
        InvestmentResult result = investmentService.calculateNps(investment);

        assertNotNull(result);
        assertEquals(1800000, result.getTotalInvestment(), 0.01);
        assertEquals(1153604.57, result.getInterestEarned(), 0.01);
        assertEquals(2953604.57, result.getMaturityAmount(), 0.01);
        assertEquals(6000, result.getMinimumAnnualInvestment(), 0.01);
    }
}
