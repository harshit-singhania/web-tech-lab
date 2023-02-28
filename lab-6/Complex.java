import java.util.Scanner;

public class Complex {
    private double real;
    private double imaginary;
    
    public void get() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the real part: ");
        real = scanner.nextDouble();
        System.out.print("Enter the imaginary part: ");
        imaginary = scanner.nextDouble();
    }
    
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
    
    public static Complex add(Complex c1, Complex c2) {
        Complex sum = new Complex();
        sum.real = c1.real + c2.real;
        sum.imaginary = c1.imaginary + c2.imaginary;
        return sum;
    }
    
    public static Complex sub(Complex c1, Complex c2) {
        Complex diff = new Complex();
        diff.real = c1.real - c2.real;
        diff.imaginary = c1.imaginary - c2.imaginary;
        return diff;
    }
    
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.get();
        Complex c2 = new Complex();
        c2.get();
        Complex sum = Complex.add(c1, c2);
        Complex diff = Complex.sub(c1, c2);
        System.out.print("Sum: ");
        sum.display();
        System.out.print("Difference: ");
        diff.display();  
    }

}

