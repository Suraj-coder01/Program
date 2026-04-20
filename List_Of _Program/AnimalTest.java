/*
Q17 Implement a class hierarchy where Animal is a base class and subclasses like Dog, Cat override a method.

continue till 20
*/
import java.util.*;
// base class
class Animal {
    void sound() {
        System.out.println("Animal sound"); // default sound
    }
}

// child class Dog
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks"); // override method
    }
}

// child class Cat
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows"); // override method
    }
}

// main class
public class AnimalTest {
    public static void main(String[] args) {

        Animal a;

        // runtime polymorphism
        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
