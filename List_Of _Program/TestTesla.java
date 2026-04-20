/*
Q27 Create:
Abstract class Vehicle
Interface Electric
Class Tesla extends Vehicle and implements Electric

continue till 30
*/

// abstract class
abstract class Vehicle {

    abstract void start(); // abstract method
}

// interface
interface Electric {

    void charge(); // method declaration
}

// class implementing both
class Tesla extends Vehicle implements Electric {

    void start() {
        System.out.println("Tesla started"); // override method
    }

    public void charge() {
        System.out.println("Charging Tesla"); // interface method
    }
}

// main class
public class TestTesla {
    public static void main(String[] args) {

        Tesla t = new Tesla();
        t.start();
        t.charge();
    }
}