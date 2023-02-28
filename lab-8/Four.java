class Shape {
    protected double area;

    public void showArea() {
        System.out.println("Area: " + area);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.area = length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
        this.area = length * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        this.area = length * width;
    }
}

public class Four {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle with radius " + circle.getRadius() + ":");
        circle.showArea();

        Rectangle rectangle = new Rectangle(6.0, 4.0);
        System.out.println("Rectangle with length " + rectangle.getLength() + " and width " + rectangle.getWidth() + ":");
        rectangle.showArea();
    }
}

