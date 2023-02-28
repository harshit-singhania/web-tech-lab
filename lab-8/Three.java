class Plate {
    private double length;
    private double width;

    // Default constructor
    public Plate() {
        this.length = 0.0;
        this.width = 0.0;
        System.out.println("Default constructor of Plate class called");
    }

    // Parameterized constructor
    public Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Parameterized constructor of Plate class called");
    }
}

class Box extends Plate {
    private double height;

    // Default constructor
    public Box() {
        super();
        this.height = 0.0;
        System.out.println("Default constructor of Box class called");
    }

    // Parameterized constructor
    public Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Parameterized constructor of Box class called");
    }
}

class WoodBox extends Box {
    private double thickness;

    // Default constructor
    public WoodBox() {
        super();
        this.thickness = 0.0;
        System.out.println("Default constructor of WoodBox class called");
    }

    // Parameterized constructor
    public WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("Parameterized constructor of WoodBox class called");
    }

    
}

public class Three {
    public static void main(String[] args) {
        WoodBox wb = new WoodBox(10.0, 8.0, 6.0, 0.5);
    }
}
