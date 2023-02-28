package fldr;

import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Fact fc = new Fact(); 
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int result = fc.findFactorial(number);
        System.out.println("Factorial of " + number + " is " + result);
        sc.close();
    }
}
    

