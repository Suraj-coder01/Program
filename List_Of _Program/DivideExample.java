/*
Q28 Write a Java program that accepts two integers from the user and performs division. 
If the denominator is zero, handle the exception and display: "Cannot divide by zero".

continue till 30
*/

import java.util.Scanner;

public class DivideExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // numerator
        int b = sc.nextInt(); // denominator

        try {
            int result = a / b; // risky operation
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero"); // handle error
        }

        System.out.println("Program continues..."); // continues execution
    }
}