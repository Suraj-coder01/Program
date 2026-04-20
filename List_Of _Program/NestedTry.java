/*
Q33 Demonstrate nested try-catch blocks. 
Inside outer try, create inner try for division and array access.

continue till 40
*/
import java.io.*;
public class NestedTry {
    public static void main(String[] args) {

        try {

            try {
                int a = 10 / 0; // division error
            } catch (ArithmeticException e) {
                System.out.println("Division by zero");
            }

            try {
                int[] arr = new int[3];
                System.out.println(arr[5]); // array error
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index error");
            }

        } catch (Exception e) {
            System.out.println("Outer exception");
        }
    }
}
