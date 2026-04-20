/*
Q23 Design a system for Payment Processing:
• Interface Payment
• Method: pay(double amount)
• Classes: CreditCardPayment, UPIPayment
• Demonstrate polymorphism


*/
import java.util.*;
// interface
interface Payment {
    void pay(double amount);
}

// credit card class
class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

// UPI class
class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

// main class
public class PaymentTest {
    public static void main(String[] args) {

        Payment p;

        p = new CreditCardPayment();
        p.pay(1000);

        p = new UPIPayment();
        p.pay(500);
    }
}