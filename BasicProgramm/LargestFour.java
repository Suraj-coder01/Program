 //Write a program to print largest of four no .
 import java.util.Scanner;

class LargestFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input  4 number : ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int max = a;

        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        System.out.println("Largest = " + max);
    }
} 
    

