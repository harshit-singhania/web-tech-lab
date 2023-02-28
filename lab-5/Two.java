// check if number is armstrong or palindrome 

import java.util.Scanner;
public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += lastDigit * lastDigit * lastDigit;
            temp /= 10;
        }
        if (sum == n) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }

        // palindrome or not 
        int r, sum1 = 0, temp1;
        temp1 = n;
        while (n > 0) {
            r = n % 10;
            sum1 = (sum1 * 10) + r;
            n = n / 10;
        }
        if (temp1 == sum1) {
            System.out.println("palindrome number ");
        } else {
            System.out.println("not a palindrome number");
        }
    }
}