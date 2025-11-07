
import java.util.*;
        import java.lang.Math;

// Base Class → Point
class Point {
    double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Euclidean distance
    double distance(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    // Translate point
    void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}

// Parent Class → Shape (Abstract)
abstract class Shape {
    abstract double getArea();
}

// Circle Class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double getArea() {
        return Math.PI * radius * radius;
    }
}

// Square Class
class Square extends Shape {
    double side;

    Square(double side) {
        this.side = side;
    }

    double getArea() {
        return side * side;
    }
}

// Main Class
public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter coordinates :");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println("Enter radius :");
        double radius = sc.nextDouble();
        System.out.println("Enter side :");
        double side = sc.nextDouble();
        System.out.println("Enter points:");
        double dx = sc.nextDouble();
        double dy = sc.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        Circle circle = new Circle(radius);
        Square square = new Square(side);

        System.out.println("Distance: " + p1.distance(p2));
        System.out.printf("Circle Area: %.2f\n", circle.getArea());
        System.out.println("Square Area: " + square.getArea());

        p1.translate(dx, dy);
        System.out.println("Translated Point1: " + p1);

        sc.close();
    }
}
