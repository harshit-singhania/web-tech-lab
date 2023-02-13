// WAP in java to create a class account having data members -costmer id,name branch and balance.
// member functions:-
// get()-to input account info
// display()-to display acc details
// withdraw(int x)- to deduct amount from coustmer acc balance
// deposit(int y )

import java.util.Scanner;

class Account {
    int customerId; 
    String name;
    int branch;
    int balance;

    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter customer id: ");
        customerId = sc.nextInt();
        System.out.println("Enter customer name: ");
        name = sc.next();
        System.out.println("Enter branch: ");
        branch = sc.nextInt();
        System.out.println("Enter balance: ");
        balance = sc.nextInt();
        sc.close();
    }

    public void display() {
        System.out.println("Customer id: " + customerId);
        System.out.println("Customer name: " + name);
        System.out.println("Branch: " + branch);
        System.out.println("Balance: " + balance);
    }

    public void withdraw(int x) {
        balance -= x;
    }

    public void deposit(int y) {
        balance += y;
    }

    public static void main(String[] args) {
        Account obj = new Account();
        obj.get();
        obj.display();
        obj.withdraw(100);
        obj.display();
        obj.deposit(100);
        obj.display();
    }
}