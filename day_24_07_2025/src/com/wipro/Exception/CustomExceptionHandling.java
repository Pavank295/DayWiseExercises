package com.wipro.Exception;
class InvalidMonthException extends Exception {
    public InvalidMonthException(String message) {
        super(message);
    }
}

// Class with method
class MonthChecker {
    public void checkMonth(int month) throws InvalidMonthException {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException("Invalid Month: " + month);
        } else {
            System.out.println("Valid Month: " + month);
        }
    }
}
