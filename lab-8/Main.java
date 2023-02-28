// Create a class Data with data members: height and breadth of object given by the
// user and member functions get_data() to read the values and put_data() to display the
// values. Create another class Rectangle that inherits class Data and implement its
// methods areaRectangle () and perimeterRectangle() that computes the area and
// perimeter of a rectangle. Create another class Triangle that inherits class Data and
// implement its methods areaTriangle() and perimeterTriangle() that computes the area
// and perimeter of a triangle.

import java.util.*;
class Data {
    public double height, breadth; 
    public void get_data() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter height: ");
        height = sc.nextDouble();
        System.out.print("Enter breadth: ");
        breadth = sc.nextDouble();
    }

    public void put_data() {
        System.out.println("Height: " + height);
        System.out.println("Breadth: " + breadth);
    }
}

class Rectangle extends Data {
    public void areaRectangle(double x, double y) {
        System.out.println("Area of rectangle: " + (x * y));
    }

    public void perimeterRectangle(double x, double y) {
        System.out.println("Perimeter of rectangle: " + (2 * (x + y)));
    }

} 

class Triangle extends Data {
    public void areaTriangle(double x, double y) {
        System.out.println("Area of triangle: " + (0.5 * x * y));
    }

    public void perimeterTriangle(double x, double y) {
        System.out.println("Perimeter of triangle: " + (x + y + Math.sqrt(x * x + y * y)));
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        r.get_data();
        r.put_data();
        r.areaRectangle(r.height, r.breadth);
        r.perimeterRectangle(r.height, r.breadth);
        t.get_data();
        t.put_data();
        t.areaTriangle(t.height, t.breadth);
        t.perimeterTriangle(t.height, t.breadth);
    }
}