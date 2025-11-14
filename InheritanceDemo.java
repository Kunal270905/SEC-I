// Base class
class Employee {
    String name;
    double salary;

    // Method to display employee info
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Derived class (inherits from Employee)
class Manager extends Employee {
    String department;

    // Method to display all manager info
    void displayManagerInfo() {
        // Call parent class method
        displayInfo();
        System.out.println("Department: " + department);
    }
}

// Main class
public class InheritanceDemo {
    public static void main(String[] args) {
        // Create Manager object
        Manager mgr = new Manager();
        mgr.name = "Alice";
        mgr.salary = 75000;
        mgr.department = "AI & ML";

        // Display all details
        System.out.println("Manager Details:");
        mgr.displayManagerInfo();
    }
}
