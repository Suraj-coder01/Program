/*
Q22 Design an Employee Management System where:
• Employee is a base class.
• FullTimeEmployee and Intern extend Employee.
• Bonus differs:
FullTime → 20% of salary
Intern → 5% of stipend
• Demonstrate runtime polymorphism.


*/
import java.util.*;
// base class
class Employee {
    double salary;

    void bonus() {
        System.out.println("Bonus");
    }
}

// full time employee
class FullTimeEmployee extends Employee {

    FullTimeEmployee(double s) {
        salary = s;
    }

    void bonus() {
        System.out.println("Bonus: " + (salary * 0.20));
    }
}

// intern
class Intern extends Employee {

    Intern(double s) {
        salary = s;
    }

    void bonus() {
        System.out.println("Bonus: " + (salary * 0.05));
    }
}

// main class
public class EmployeeTest {
    public static void main(String[] args) {

        Employee e;

        e = new FullTimeEmployee(10000);
        e.bonus();

        e = new Intern(5000);
        e.bonus();
    }
}
