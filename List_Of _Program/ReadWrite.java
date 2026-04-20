/*
Q19 Create two interfaces (Readable, Writable) and a class that implements them both.

continue till 20
*/
import java.util.*;
// Readable interface
interface Readable {
    void read();
}

// Writable interface
interface Writable {
    void write();
}

// class implementing both
public class ReadWrite implements Readable, Writable {

    public void read() {
        System.out.println("Reading data"); // read method
    }

    public void write() {
        System.out.println("Writing data"); // write method
    }

    public static void main(String[] args) {

        ReadWrite r = new ReadWrite();

        r.read();  // call read
        r.write(); // call write
    }
}