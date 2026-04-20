/*
Q38 Write a Java program to read a text file and count:
Number of characters, Number of words, Number of lines.

*/

import java.io.*;

public class FileCount {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("test.txt"));

        int lines = 0, words = 0, chars = 0;

        String line;

        // read file
        while ((line = br.readLine()) != null) {

            lines++; // count line

            chars += line.length(); // count characters

            words += line.split(" ").length; // count words
        }

        br.close(); // close file

        // print results
        System.out.println("Lines: " + lines);
        System.out.println("Words: " + words);
        System.out.println("Characters: " + chars);
    }
}