package com.example.payment;

public class SquareAdapter implements PaymentProcessor {
    private SquarePaymentGateway square;

    public SquareAdapter(SquarePaymentGateway square) {
        this.square = square;
    }

    @Override
    public void processPayment(double amount) {
        square.executePayment(amount);
    }
}