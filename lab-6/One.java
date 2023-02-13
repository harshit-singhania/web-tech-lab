// WAP in java to create a class complex having data members real and imaginary .and member fuxn
// get()-to get real and img values
// display()- to display them
// add(complex c1, complex c2)- add them
// subtract(complex c1, complex c2)- subtract them

import java.util.Scanner;
class One {
    public static void main(String[] args) {
        Complex complex = new Complex();
        complex.get();
        complex.display();
        Complex complex1 = new Complex();
        complex1.get();
        complex1.display();
        Complex complex2 = new Complex();
        complex2.add(complex, complex1);
        complex2.display();
        complex2.subtract(complex, complex1);
        complex2.display();
    }
}

class Complex {
    int real;
    int imaginary;
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter real part");
        real = sc.nextInt();
        System.out.println("enter imaginary part");
        imaginary = sc.nextInt();
    }
    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
    public void add(Complex c1, Complex c2) {
        real = c1.real + c2.real;
        imaginary = c1.imaginary + c2.imaginary;
    }
    public void subtract(Complex c1, Complex c2) {
        real = c1.real - c2.real;
        imaginary = c1.imaginary - c2.imaginary;
    }
}