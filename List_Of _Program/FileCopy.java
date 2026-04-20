/*
Q39 Write a program to copy contents of one file into another file using byte streams.

continue till 40
*/

import java.io.*;

public class FileCopy {
    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream("input.txt"); // source file
        FileOutputStream fos = new FileOutputStream("output.txt"); // destination file

        int data;

        // read and write byte by byte
        while ((data = fis.read()) != -1) {
            fos.write(data);
        }

        fis.close(); // close input
        fos.close(); // close output

        System.out.println("File copied successfully");
    }
}