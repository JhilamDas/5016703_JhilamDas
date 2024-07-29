package com.example.test;

import com.example.payment.*;

public class AdapterPatternTest {

    public static void main(String[] args) {
        // Creating instances of different payment gateways
        PayPalPaymentGateway payPalGateway = new PayPalPaymentGateway();
        StripePaymentGateway stripeGateway = new StripePaymentGateway();
        SquarePaymentGateway squareGateway = new SquarePaymentGateway();

        // Creating adapters for each payment gateway
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);
        PaymentProcessor squareProcessor = new SquareAdapter(squareGateway);

        // Processing payments through the adapters
        payPalProcessor.processPayment(100.00);
        stripeProcessor.processPayment(200.00);
        squareProcessor.processPayment(300.00);
    }
}