// Q44: Create a Student class that implements Serializable.
// Write a program to serialize the object into a file.

import java.io.*;

// Student class must implement Serializable to allow object saving
class Student implements Serializable {
    int roll;
    String name;

    // constructor to initialize values
    Student(int r, String n) {
        roll = r;
        name = n;
    }
}

class StudentSerialization {
    public static void main(String[] args) {
        try {
            // create object
            Student s1 = new Student(101, "Rahul");

            // ObjectOutputStream used to write object into file
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.ser"));

            oos.writeObject(s1); // serialize object
            oos.close();

            System.out.println("Object Serialized Successfully!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}