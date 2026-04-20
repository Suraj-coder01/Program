/*
Q15 Design an ATM System using Java with exception handling that supports:
• Card validation
• PIN authentication
• Withdraw amount
• Deposit amount
• Check balance

continue till 20
*/
import java.util.*;
// ATM class
class ATM {

    double balance = 1000; // initial balance

    // method to deposit money
    void deposit(double amt) {
        balance += amt; // add amount
        System.out.println("Balance: " + balance);
    }

    // method to withdraw money
    void withdraw(double amt) {
        if (amt > balance) { // check insufficient balance
            System.out.println("Insufficient balance");
        } else {
            balance -= amt; // deduct amount
            System.out.println("Balance: " + balance);
        }
    }
}

// main class
public class ATMSystem {

    public static void main(String[] args) {

        // create ATM object
        ATM a = new ATM();

        // deposit money
        a.deposit(500);

        // withdraw money
        a.withdraw(200);
    }
}