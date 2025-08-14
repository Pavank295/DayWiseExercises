class BankAccount {
    constructor(accountNumber, balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    deposit(amount) {
        this.balance += amount;
        console.log(`Deposited: ${amount}, New Balance: ${this.balance}`);
    }
    withdraw(amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
            console.log(`Withdrew: ${amount}, New Balance: ${this.balance}`);
        } else {
            console.log("Insufficient balance");
        }
    }
}
let account = new BankAccount(96350616, 1000);
account.deposit(500);  
account.withdraw(300);  
account.withdraw(2000); 
