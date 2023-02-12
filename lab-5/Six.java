// check if number is spy number or not

public class Six {
    public static void main(String[] args) {
        int n = 123;
        int temp = n;
        int sum = 0;
        int product = 1;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum += lastDigit;
            product *= lastDigit;
            temp /= 10;
        }
        if (sum == product) {
            System.out.println("Spy number");
        } else {
            System.out.println("Not a spy number");
        }
    }
}
