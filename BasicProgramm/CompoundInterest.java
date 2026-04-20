import java.util.Scanner;

class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle Value :");

        double p = sc.nextDouble(); // principal
        System.out.print("Enter the Rate :");

        double r = sc.nextDouble(); // rate
        System.out.print("Enter the time  :");

        double t = sc.nextDouble(); // time

        double amount = p * Math.pow((1 + r / 100), t);
        double ci = amount - p;

        System.out.println("Compound Interest = " + ci);
    }
}
