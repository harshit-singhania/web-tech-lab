// A plastic manufacturer sells plastic in different shapes like Two_D sheet and Three_D box. The cost of sheet is Rs 40/ per square ft. and the cost of box is Rs 60/ per cubic ft. Implement
// it in Java to calculate the cost of plastic as per the dimensions given by the user where
// Three_D inherits from Two_D. 

import java.util.Scanner;
class Two_D {
    protected double length, width; 
    public Two_D(double length, double width) {
        this.length = length; 
        this.width = width; 
    }
    public double getArea() {
        return length*width; 
    }
}

class Three_D extends Two_D {
    private double height; 
    public Three_D(double length, double width, double height) {
        super(length, width); 
        this.height = height; 
    } 

    public double getVolume() {
        return length*width*height;
    }
 
    public double getCost() {
        return getVolume()*60; 
    }
}

public class PlasticManufacturer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter dimensions for sheet"); 
        double length = scanner.nextDouble(); 
        double width = scanner.nextDouble(); 
        Two_D sheet = new Two_D(length, width); 
        double sheetArea = sheet.getArea(); 
        double sheetCost = sheetArea*40; 
        System.out.println("cost of sheet is : " + sheetCost);

        System.out.print("Enter the dimensions of the plastic box (length, width, and height): ");
        length = scanner.nextDouble();
        width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Three_D box = new Three_D(length, width, height);
        double boxVolume = box.getVolume();
        double boxCost = box.getCost();
        System.err.println("Volume of plastic box: "+boxVolume);
        System.out.println("Cost of plastic box: Rs. " + boxCost);
        scanner.close();

    }
}
