/*
Q35 Create a custom exception NegativeNumberException. 
If number is negative, throw exception else print square.


*/
import java.io.*;
// custom exception
class NegativeNumberException extends Exception {

    NegativeNumberException(String msg) {
        super(msg);
    }
}

// main class
public class NegativeCheck {
    public static void main(String[] args) {

        int num = -5;

        try {

            if (num < 0) {
                throw new NegativeNumberException("Negative number not allowed");
            }

            System.out.println("Square: " + (num * num));

        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}