/*
Q1 Write a program to print a pyramid pattern according to the number of rows entered by the user.
                   1 
                 1 2 1 
               1 2 3 2 1 
             1 2 3 4 3 2 1 
           1 2 3 4 5 4 3 2 1 
         1 2 3 4 5 6 5 4 3 2 1 
       1 2 3 4 5 6 7 6 5 4 3 2 1 
     1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 
   1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1 
*/

import java.util.Scanner;

public class PyramidPattern {

    public static void main(String[] args) {

        // take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        // outer loop
        for (int i = 1; i <= n; i++) {

            // print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // next line
            System.out.println();
        }
    }
}