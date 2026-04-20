// Q43: Read integers using Scanner and handle invalid input using InputMismatchException

import java.util.*;

class ScannerExceptionHandling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // scanner object

        try {
            System.out.print("Enter an integer: ");
            int num = sc.nextInt(); // may cause exception

            System.out.println("You entered: " + num);

        } catch (InputMismatchException e) {
            // if user enters wrong input like string
            System.out.println("Invalid input! Please enter integer only.");
        }

        sc.close(); // closing scanner
    }
}
