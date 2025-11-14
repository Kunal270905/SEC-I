// Base class
class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

// Subclass Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of the circle
    double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of the rectangle
    double area() {
        return length * width;
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        // Create Circle object
        Circle c = new Circle(5.0);  // radius = 5
        System.out.println("Circle:");
        c.displayShape();
        System.out.println("Area of Circle = " + c.area());

        // Create Rectangle object
        Rectangle r = new Rectangle(4.0, 6.0);  // length = 4, width = 6
        System.out.println("\nRectangle:");
        r.displayShape();
        System.out.println("Area of Rectangle = " + r.area());
    }
}
