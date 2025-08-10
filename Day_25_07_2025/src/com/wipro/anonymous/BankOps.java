package com.wipro.anonymous;
public class BankOps 
    public static void main(String[] args) {

        // Anonymous inner class for Savings Account
        BankOps savingsAccount = new BankOps() {
            public void deposit(double amount) {
                System.out.println("Deposited ₹" + amount + " into Savings Account.");
            }
        };

        // Anonymous inner class for Current Account
        BankOps currentAccount = new BankOps() {
            public void deposit(double amount) {
                System.out.println("Deposited ₹" + amount + " into Current Account.");
            }
        };

        // Calling deposit method
        savingsAccount.deposit(1000);
        currentAccount.deposit(5000);
    }
}



