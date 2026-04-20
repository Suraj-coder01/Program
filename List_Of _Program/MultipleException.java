/*
Q30 Store 5 integers in array. 
Handle ArrayIndexOutOfBoundsException and ArithmeticException using multiple catch.
*/
import java.util.*;
public class MultipleException {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        try {

            System.out.println(arr[10]); // invalid index

            int x = 10 / 0; // division by zero

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero");
        }
    }
}