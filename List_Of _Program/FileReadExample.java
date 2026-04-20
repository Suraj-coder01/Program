/*
Q31 Create a method readFile(String filename) that throws IOException. 
Call this method inside main() and handle the exception using try-catch.

continue till 40
*/

import java.io.*;

// main class
public class FileReadExample {

    // method that throws exception
    static void readFile(String filename) throws IOException {

        FileReader fr = new FileReader(filename); // open file
        BufferedReader br = new BufferedReader(fr); // read text

        String line;

        // read file line by line
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close(); // close file
    }

    public static void main(String[] args) {

        try {
            readFile("test.txt"); // call method
        } catch (IOException e) {
            System.out.println("File not found"); // handle exception
        }
    }
}