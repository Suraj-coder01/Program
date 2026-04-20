/*
Q24 Create a package:
com.infosys.bank
Inside it create:
• Account (protected balance)
• SavingsAccount (extends Account)
Access it from another package.

continue till 30
*/
package com.infosys.bank;

// base class
class Account {
    protected double balance = 1000; // protected so child can access
}

// child class
class SavingsAccount extends Account {

    void showBalance() {
        System.out.println("Balance: " + balance); // accessing protected variable
    }
}

// main class in same file (for simplicity)
public class TestBank {

    public static void main(String[] args) {

        // create object of child class
        SavingsAccount s = new SavingsAccount();

        // call method
        s.showBalance();
    }
}