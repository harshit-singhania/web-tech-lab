// in java A Base class Detail has been defined to store the details of a customer having Data members: name ,address,service number/meter number and Member functions: Detail(…) : parameterized constructor to assign values to data members and void show() : to display the detail of the customer. Define a subclass PowerBill having Data members n : to store the number of units used, Total_bill: to store the amount to be paid by the customer and Member functions PowerBill(): parameterized constructor to assign values to data members of both classes and to initialize amt = 0.0.void cal() : calculates the monthly charge as per the unit range charge given below and void show() : to display the detail of the customer and amount to be paid. 

import java.util.*;
class Detail {
    String name;
    String address;
    int serviceNumber;
    
    Detail(String name, String address, int serviceNumber) {
        this.name = name;
        this.address = address;
        this.serviceNumber = serviceNumber;
    }
    
    void show() {
        System.out.println("Customer Detail:");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Service Number: " + serviceNumber);
    }
}

class PowerBill extends Detail {
    int n;
    double totalBill;
    
    PowerBill(String name, String address, int serviceNumber, int n) {
        super(name, address, serviceNumber);
        this.n = n;
        this.totalBill = 0.0;
    }
    
    void cal() {
        if (n <= 100) {
            totalBill = n * 1.20;
        } else if (n <= 200) {
            totalBill = 100 * 1.20 + (n - 100) * 2.00;
        } else if (n <= 300) {
            totalBill = 100 * 1.20 + 100 * 2.00 + (n - 200) * 3.00;
        } else {
            totalBill = 100 * 1.20 + 100 * 2.00 + 100 * 3.00 + (n - 300) * 4.00;
        }
    }
    
    void show() {
        super.show();
        System.out.println("Units Used: " + n);
        System.out.println("Total Bill: " + totalBill);
    }

    public static void main(String[] args) {
        // PowerBill pb = new PowerBill("harshit", "howrah", 1, 1); 
        String name, address; 
        int id, n; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter name");
        name = sc.nextLine(); 
        System.out.println("Enter address"); 
        address = sc.nextLine(); 
        System.out.println("Enter customer ID"); 
        id = sc.nextInt(); 
        System.out.println("Enter units used"); 
        n = sc.nextInt(); 
        PowerBill pb = new PowerBill(name, address, id, n); 
        pb.cal();
        pb.show();
    }
}
