 import java.util.Scanner;

 class Addition {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Addition
        int sum = num1 + num2;

        // Output
        System.out.print("Sum = " + sum);
    }
}