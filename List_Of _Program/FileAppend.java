/*
Q40 Write a Java program to append data into an existing file. If file does not exist, create it.

continue till 40
*/

import java.io.*;

public class FileAppend {
    public static void main(String[] args) throws Exception {

        // FileWriter with true enables append mode
        FileWriter fw = new FileWriter("test.txt", true);

        fw.write("New Data Added\n"); // write data

        fw.close(); // close file

        System.out.println("Data appended successfully");
    }
}