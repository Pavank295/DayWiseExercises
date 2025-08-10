package com.wipro.Interface;
public class GooglePay implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Google Pay.");
    }
}
