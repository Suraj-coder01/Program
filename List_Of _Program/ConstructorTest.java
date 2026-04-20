/*
Q21 Show constructor chaining with super() when subclass calls superclass constructor.

*/
import java.util.*;
// base class
class Parent {

    Parent() {
        System.out.println("Parent constructor"); // called first
    }
}

// child class
class Child extends Parent {

    Child() {
        super(); // calls parent constructor
        System.out.println("Child constructor");
    }
}

// main class
public class ConstructorTest {
    public static void main(String[] args) {

        // object creation
        Child c = new Child();
    }
}
