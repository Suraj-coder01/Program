import java.util.*;
public class EvenFibonacciSum {
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        int sum = 0;
         System.out.println("Fibonacci Series up to 25 .");
         System.out.print(a +" " + b+" ");

        while (true) {
            c = a + b;
            if (c > 25)
                break;
            System.out.print(c +" ");

            if (c % 2 == 0)
                sum += c;

            a = b;
            b = c;
        }

        System.out.println("Even Sum = " + sum);
    }
}
    

