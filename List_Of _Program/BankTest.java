/*
Q36 Create a BankAccount class with balance. Create a method withdraw(double amount). 
If amount is greater than balance, throw InsufficientFundsException. 
Handle the exception in main method.


*/
import java.io.*;
// custom exception class
class InsufficientFundsException extends Exception {

    // constructor to pass message
    InsufficientFundsException(String msg) {
        super(msg);
    }
}

// BankAccount class
class BankAccount {

    double balance = 1000; // initial balance

    // withdraw method
    void withdraw(double amount) throws InsufficientFundsException {

        // check if amount exceeds balance
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient Balance");
        }

        balance -= amount; // deduct amount
        System.out.println("Remaining Balance: " + balance);
    }
}

// main class
public class BankTest {

    public static void main(String[] args) {

        BankAccount b = new BankAccount(); // create object

        try {
            b.withdraw(1500); // attempt to withdraw more than balance
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage()); // print error message
        }
    }
}