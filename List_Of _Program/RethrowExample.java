/*
Q34 Write a program where a method throws an exception and the calling method rethrows it to main().


*/
import java .io.*;
public class RethrowExample {

    static void method1() throws Exception {
        throw new Exception("Error in method1"); // throw exception
    }

    static void method2() throws Exception {
        method1(); // call method1
    }

    public static void main(String[] args) {

        try {
            method2(); // call method2
        } catch (Exception e) {
            System.out.println(e.getMessage()); // handle exception
        }
    }
}