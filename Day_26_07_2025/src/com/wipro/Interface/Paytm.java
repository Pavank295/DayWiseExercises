package com.wipro.Interface;
public class Paytm implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Paytm.");
    }
}
