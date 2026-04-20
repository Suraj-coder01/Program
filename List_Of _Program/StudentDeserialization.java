// Q45: Deserialize Student object from file and display details

import java.io.*;

class StudentDeserialization {
    public static void main(String[] args) {
        try {
            // ObjectInputStream used to read object
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.ser"));

            // casting required because readObject returns Object
            Student s = (Student) ois.readObject();

            ois.close();

            // display data
            System.out.println("Roll: " + s.roll);
            System.out.println("Name: " + s.name);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
