/*
Q18 Show how a class implements two interfaces (I1 and I2) with default methods having same signature.

continue till 20
*/
import java.util.*;
// interface 1
interface I1 {
    default void show() {
        System.out.println("I1 method");
    }
}

// interface 2
interface I2 {
    default void show() {
        System.out.println("I2 method");
    }
}

// class implementing both
public class InterfaceTest implements I1, I2 {

    // override to remove ambiguity
    public void show() {
        I1.super.show(); // calling I1 method
    }

    public static void main(String[] args) {
        new InterfaceTest().show();
    }
}