// Q42: Write a Java program that reads student details (roll, name, marks)
// and writes them into a file. Then display file content.

import java.io.*;

class StudentFileWriteRead {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            // Taking input
            System.out.print("Enter Roll No: ");
            String roll = br.readLine();

            System.out.print("Enter Name: ");
            String name = br.readLine();

            System.out.print("Enter Marks: ");
            String marks = br.readLine();

            // Writing to file
            FileWriter fw = new FileWriter("student.txt");
            fw.write("Roll: " + roll + "\n");
            fw.write("Name: " + name + "\n");
            fw.write("Marks: " + marks + "\n");
            fw.close();

            // Reading from file
            BufferedReader fileReader = new BufferedReader(new FileReader("student.txt"));
            String line;

            System.out.println("\nFile Content:");
            while ((line = fileReader.readLine()) != null) {
                System.out.println(line); // print file data
            }

            fileReader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}