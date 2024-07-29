package com.financialforecasting;

import java.util.HashMap;
import java.util.Map;

public class FinancialForecasting {
    private static Map<Integer, Double> memo = new HashMap<>();

    public static double calculateFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        if (memo.containsKey(years)) {
            return memo.get(years);
        }
        double futureValue = (1 + growthRate) * calculateFutureValue(initialValue, growthRate, years - 1);
        memo.put(years, futureValue);
        return futureValue;
    }

    public static void main(String[] args) {
        double initialValue = 1000.0; // Initial investment
        double annualGrowthRate = 0.05; // 5% annual growth rate
        int years = 10; // Number of years

        double futureValue = calculateFutureValue(initialValue, annualGrowthRate, years);
        System.out.println("Future Value after " + years + " years: $" + futureValue);
    }
}