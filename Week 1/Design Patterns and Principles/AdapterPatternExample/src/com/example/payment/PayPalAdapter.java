package com.example.payment;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalPaymentGateway payPal;

    public PayPalAdapter(PayPalPaymentGateway payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        payPal.sendPayment(amount);
    }
}