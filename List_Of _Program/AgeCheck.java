/*
Q29 Create a user-defined exception named InvalidAgeException.
If age < 18 → "Not eligible to vote"

continue till 30
*/
import java.util.*;
// custom exception
class InvalidAgeException extends Exception {

    InvalidAgeException(String msg) {
        super(msg); // pass message
    }
}

// main class
public class AgeCheck {
    public static void main(String[] args) {

        int age = 19;

        try {
            if (age < 18) {
                throw new InvalidAgeException("Not eligible to vote");
            } else {
                System.out.println("Eligible to vote");
            }
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage()); // print message
        }
    }
}