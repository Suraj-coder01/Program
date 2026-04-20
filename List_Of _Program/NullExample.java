/*
Q32 Write a program that deliberately generates a NullPointerException. 
Catch the exception and print message, stack trace, and class name.

continue till 40
*/
import java.io.*;
public class NullExample {
    public static void main(String[] args) {

        try {

            String s = null; // null reference
            System.out.println(s.length()); // causes exception

        } catch (NullPointerException e) {

            System.out.println("Message: " + e.getMessage()); // message
            e.printStackTrace(); // stack trace
            System.out.println("Class: " + e.getClass().getName()); // class name
        }
    }
}