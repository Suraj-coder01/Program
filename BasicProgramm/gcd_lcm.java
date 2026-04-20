//Write a program to find LCM , GCD,HCF of no .
import java.util.Scanner;

class gcd_lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input any two number :");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a, y = b;

        // GCD
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        int gcd = x;
        int lcm = (a * b) / gcd;

        System.out.println("GCD/HCF = " + gcd);
        System.out.println("LCM = " + lcm);
    }
}