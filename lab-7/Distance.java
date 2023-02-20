// Write a program in java to create a class Distance having feet and inches as
// data members and perform following operations
// A. Add two distances
// B. Subtract two distances

public class Distance {
    int feet;
    int inches;

    public Distance(int feet, int inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void displayDistance() {
        System.out.println("Feet: " + feet + " Inches: " + inches);
    }

    public void addDistance(Distance d2) {
        int totalInches = inches + d2.inches;
        int carry = totalInches / 12;
        totalInches = totalInches % 12;
        feet += carry + d2.feet;
        System.out.println("Sum of distances: ");
        displayDistance();
    }

    public void subtractDistance(Distance d2) {
        int totalInches = (feet * 12 + inches) - (d2.feet * 12 + d2.inches);
        if (totalInches >= 0) {
            feet = totalInches / 12;
            inches = totalInches % 12;
            System.out.println("Difference of distances: ");
            displayDistance();
        } else {
            System.out.println("Cannot subtract the distances.");
        }
    }

    public static void main(String[] args) {
        Distance d1 = new Distance(2, 5);
        Distance d2 = new Distance(3, 9);
        d1.displayDistance();
        d2.displayDistance();
        d1.addDistance(d2);
        d1.subtractDistance(d2);
    }
}
