/*
Q37 Write a program using try-with-resources to read a file and display its content.

continue till 40
*/

import java.io.*;

public class TryWithResource {
    public static void main(String[] args) {

        // try-with-resources automatically closes file
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            String line;

            // read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file"); // handle error
        }
    }
}