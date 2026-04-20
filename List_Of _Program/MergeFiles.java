// Q47: Merge contents of two files into a third file

import java.io.*;

class MergeFiles {
    public static void main(String[] args) {
        try {
            // File readers for two input files
            BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));

            // File writer for output file
            BufferedWriter bw = new BufferedWriter(new FileWriter("merged.txt"));

            String line;

            // copy first file
            while ((line = br1.readLine()) != null) {
                bw.write(line);
                bw.newLine(); // move to next line
            }

            // copy second file
            while ((line = br2.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }

            // close all files
            br1.close();
            br2.close();
            bw.close();

            System.out.println("Files merged successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
