package com.example.npscalculator.service;

import com.example.npscalculator.model.Investment;
import com.example.npscalculator.model.InvestmentResult;
import org.springframework.stereotype.Service;

@Service
public class InvestmentService {

    public InvestmentResult calculateNps(Investment investment) {
        double investmentPerMonth = investment.getInvestmentPerMonth();
        double rate = investment.getExpectedRatePerAnnum() / 100;
        int years = 60 - investment.getAge();
        double totalInvestment = investmentPerMonth * 12 * years;

        double maturityAmount = 0.0;
        double currentBalance = 0.0;
        for (int i = 0; i < years; i++) {
            currentBalance = (currentBalance + (investmentPerMonth * 12)) * (1 + rate);
        }
        maturityAmount = currentBalance;
        double interestEarned = maturityAmount - totalInvestment;
        double minimumAnnualInvestment = 6000; // Example minimum value, this can be parameterized

        return new InvestmentResult(totalInvestment, interestEarned, maturityAmount, minimumAnnualInvestment);
    }
}
