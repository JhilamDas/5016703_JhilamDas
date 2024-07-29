package com.example.test;

import com.example.payment.*;

public class StrategyPatternTest {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("John Doe", "1234567890123456", "123", "12/23");
        context.setPaymentStrategy(creditCardPayment);
        context.executePayment(100.00);

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "password");
        context.setPaymentStrategy(payPalPayment);
        context.executePayment(200.00);
    }
}