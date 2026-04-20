// Q46: Open a file that does not exist and handle FileNotFoundException

import java.io.*;

class FileNotFoundDemo {
    public static void main(String[] args) {
        try {
            // trying to open non-existing file
            FileReader fr = new FileReader("unknown.txt");

        } catch (FileNotFoundException e) {
            // handling exception
            System.out.println("File not found! Please check file name.");
        }
    }
}