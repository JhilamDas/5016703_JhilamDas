package com.example.payment;

public class PayPalPaymentGateway {
    public void sendPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " through PayPal.");
    }
}