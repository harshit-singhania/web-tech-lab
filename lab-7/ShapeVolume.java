// Write a program in java to perform following operations using function
// overloading concept and constructor overloading concept
// A. Volume Of Sphere
// B. Volume Of Prism
// C. Volume Of Cylinder
// D. Volume Of Cone
// E. Volume Of Cuboid

public class ShapeVolume {
    double volume; 

    // Constructor Overloading
    ShapeVolume() {
        volume = 0.0;
    }

    ShapeVolume(double volume) {
        this.volume = volume;
    }

    // Function Overloading
    void volume(double radius) {
        volume = (4 / 3) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Sphere: " + volume);
    }

    void volume(double length, double width, double height) {
        volume = length * width * height;
        System.out.println("Volume of Cuboid: " + volume);
    }

    void volume(double radius, double height) {
        volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Volume of Cylinder: " + volume);
    }

    void volume(double radius, double height, String type) {
        if (type.equalsIgnoreCase("cone")) {
            volume = (1 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
            System.out.println("Volume of Cone: " + volume);
        } else if (type.equalsIgnoreCase("prism")) {
            volume = (1 / 2.0) * Math.PI * Math.pow(radius, 2) * height;
            System.out.println("Volume of Prism: " + volume);
        } else {
            System.out.println("Invalid shape type");
        }
    }

    public static void main(String[] args) {
        ShapeVolume sv1 = new ShapeVolume();
        sv1.volume(5); // Volume of Sphere

        ShapeVolume sv2 = new ShapeVolume();
        sv2.volume(3, 4, 5); // Volume of Cuboid

        ShapeVolume sv3 = new ShapeVolume();
        sv3.volume(2, 5); // Volume of Cylinder

        ShapeVolume sv4 = new ShapeVolume();
        sv4.volume(3, 5, "cone"); // Volume of Cone
    }
}
