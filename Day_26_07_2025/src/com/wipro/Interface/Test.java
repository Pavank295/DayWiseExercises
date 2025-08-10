package com.wipro.Interface;
public class Test {
    public static void main(String[] args) {
        DigitalPayment googlePay = new GooglePay();
        DigitalPayment phonePe = new PhonePe();
        DigitalPayment paytm = new Paytm();
        PaymentProcessor processor1 = new PaymentProcessor(googlePay);
        processor1.makePayment(1500.00);
        PaymentProcessor processor2 = new PaymentProcessor(phonePe);
        processor2.makePayment(800.00);
        PaymentProcessor processor3 = new PaymentProcessor(paytm);
        processor3.makePayment(500.00);
    }
}