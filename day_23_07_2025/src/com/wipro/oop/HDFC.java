package com.wipro.oop;
import java.util.HashMap;
import java.util.Map;
public class HDFC implements BankOps {
    private Map<String, Double> accounts = new HashMap<>();
    public void deposit(double amount, String accNumber) {
        double current = accounts.getOrDefault(accNumber, 0.0);
        accounts.put(accNumber, current + amount);
        System.out.println("HDFC: Deposited " + amount + " into account " + accNumber);
    }
    public double getBalance(String accNumber) {
        return accounts.getOrDefault(accNumber, 0.0);
    }
}