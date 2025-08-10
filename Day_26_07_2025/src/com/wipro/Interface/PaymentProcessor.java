package com.wipro.Interface;
public class PaymentProcessor {
    private DigitalPayment payment;
    public PaymentProcessor(DigitalPayment payment) {
        this.payment = payment;
    }
    public void makePayment(double amount) {
        payment.pay(amount);
    }
}
