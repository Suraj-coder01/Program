/*
Q26 Demonstrate constructor execution order. (Constructor chaining)

continue till 30
*/
import java.util.*;
// parent class
class Parent {

    Parent() {
        System.out.println("Parent constructor"); // called first
    }
}

// child class
class Child extends Parent {

    Child() {
        System.out.println("Child constructor"); // called after parent
    }
}

// main class
public class ConstructorOrder {
    public static void main(String[] args) {

        // object creation triggers constructors
        new Child();
    }
}