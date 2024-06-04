package com.example.npscalculator.model;

public class InvestmentResult {
    private double totalInvestment;
    private double interestEarned;
    private double maturityAmount;
    private double minimumAnnualInvestment;

    // Default constructor
    public InvestmentResult() {
    }

    // Parameterized constructor
    public InvestmentResult(double totalInvestment, double interestEarned, double maturityAmount, double minimumAnnualInvestment) {
        this.totalInvestment = totalInvestment;
        this.interestEarned = interestEarned;
        this.maturityAmount = maturityAmount;
        this.minimumAnnualInvestment = minimumAnnualInvestment;
    }

    // Getters and Setters
    public double getTotalInvestment() {
        return totalInvestment;
    }

    public void setTotalInvestment(double totalInvestment) {
        this.totalInvestment = totalInvestment;
    }

    public double getInterestEarned() {
        return interestEarned;
    }

    public void setInterestEarned(double interestEarned) {
        this.interestEarned = interestEarned;
    }

    public double getMaturityAmount() {
        return maturityAmount;
    }

    public void setMaturityAmount(double maturityAmount) {
        this.maturityAmount = maturityAmount;
    }

    public double getMinimumAnnualInvestment() {
        return minimumAnnualInvestment;
    }

    public void setMinimumAnnualInvestment(double minimumAnnualInvestment) {
        this.minimumAnnualInvestment = minimumAnnualInvestment;
    }
}
