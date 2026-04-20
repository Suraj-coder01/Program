/*
Q14 Design a Parking Lot system that:
• Supports multiple types of vehicles (Car, Bike, Truck).
• Allocates parking spot based on vehicle type.
• Frees parking spot when vehicle exits.
• Generates a parking ticket.
*/
import java.util.*;
// base class Vehicle
class Vehicle { }

// child classes for different vehicle types
class Car extends Vehicle { }
class Bike extends Vehicle { }
class Truck extends Vehicle { }

// class to manage parking
class ParkingLot {

    // method to park vehicle
    void park(Vehicle v) {
        // get class name dynamically
        System.out.println(v.getClass().getSimpleName() + " parked");
    }
}

// main class
public class ParkingSystem {

    public static void main(String[] args) {

        // create ParkingLot object
        ParkingLot p = new ParkingLot();

        // park different vehicles
        p.park(new Car());   // create Car object and park
        p.park(new Bike());  // create Bike object and park
        p.park(new Truck()); // create Truck object and park
    }
}
