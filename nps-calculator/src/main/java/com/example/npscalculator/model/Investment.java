package com.example.npscalculator.model;

public class Investment {
    private double investmentPerMonth;
    private double expectedRatePerAnnum;
    private int age;

    // Default constructor
    public Investment() {
    }

    // Parameterized constructor
    public Investment(double investmentPerMonth, double expectedRatePerAnnum, int age) {
        this.investmentPerMonth = investmentPerMonth;
        this.expectedRatePerAnnum = expectedRatePerAnnum;
        this.age = age;
    }

    // Getters and Setters
    public double getInvestmentPerMonth() {
        return investmentPerMonth;
    }

    public void setInvestmentPerMonth(double investmentPerMonth) {
        this.investmentPerMonth = investmentPerMonth;
    }

    public double getExpectedRatePerAnnum() {
        return expectedRatePerAnnum;
    }

    public void setExpectedRatePerAnnum(double expectedRatePerAnnum) {
        this.expectedRatePerAnnum = expectedRatePerAnnum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
