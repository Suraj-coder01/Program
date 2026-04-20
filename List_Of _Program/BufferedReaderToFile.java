// Q41: Write a program to accept user input using BufferedReader and store the data in a file.

import java.io.*; // for BufferedReader & FileWriter

class BufferedReaderToFile {
    public static void main(String[] args) {
        try {
            // BufferedReader used to take input from keyboard
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Ask user input
            System.out.print("Enter your text: ");
            String data = br.readLine(); // read full line

            // FileWriter used to write into file
            FileWriter fw = new FileWriter("data.txt");

            fw.write(data); // writing user data into file
            fw.close(); // close file

            System.out.println("Data written successfully!");

        } catch (IOException e) {
            // handling input/output error
            System.out.println("Error: " + e.getMessage());
        }
    }
}