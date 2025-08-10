package com.wipro.Exception;
public class CurrencyConverter  {  
    public static int changeCurrency(int number) throws NumberFormatException {
        if (number == 0) {
            throw new NumberFormatException("Invalid Number");
        }
        return number * 80;
    }
    public static void main(String[] args) {
        try {
            int result = changeCurrency(5); 
            System.out.println("Converted amount: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
