import java.util.Scanner;

public class Account {
    private int customerId;
    private String customerName;
    private String branch;
    private double balance;
    
    public void get() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer ID: ");
        customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter customer name: ");
        customerName = scanner.nextLine();
        System.out.print("Enter branch: ");
        branch = scanner.nextLine();
        System.out.print("Enter balance: ");
        balance = scanner.nextDouble();
    }
    
    public void display() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer name: " + customerName);
        System.out.println("Branch: " + branch);
        System.out.println("Balance: " + balance);
    }
    
    public void withdraw(int amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
    
    public void deposit(int dep) {
        balance += dep;
        System.out.println("Deposit successful. New balance: " + balance);
    }
    
    public static void main(String[] args) {
        Account acc = new Account();
        acc.get();
        acc.display();
        acc.withdraw(500);
        acc.deposit(1000);
    }
}

