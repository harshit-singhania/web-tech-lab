// Write a program in Java having a class called Address with 2 methods called getAddress() and setAddress() The Address class will have three child classes named Address, Office Address and SchoolAddress having same functions as Address class.use dynamic method dispatch concept to override the derived class methods and display the address of home, office and school accordingly 

import java.util.Scanner;

class Address implements AddressInterface {
    String address;
    Scanner sc = new Scanner(System.in);

    public void getAddress() {
        System.out.println("Enter Address: ");
        address = sc.nextLine();
    }

    public void setAddress() {
        System.out.println("Address: " + address);
    }
}



 interface AddressInterface {
    void getAddress();

    void setAddress();
}

 class OfficeAddress extends Address {
    String officeAddress;

    public void getAddress() {
        System.out.println("Enter Office Address: ");
        officeAddress = sc.nextLine();
    }

    public void setAddress() {
        System.out.println("Office Address: " + officeAddress);
    }
}

 class SchoolAddress extends Address {
    String schoolAddress;

    public void getAddress() {
        System.out.println("Enter School Address: ");
        schoolAddress = sc.nextLine();
    }

    public void setAddress() {
        System.out.println("School Address: " + schoolAddress);
    }
}

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        OfficeAddress officeAddress = new OfficeAddress();
        SchoolAddress schoolAddress = new SchoolAddress();

        address.getAddress();
        address.setAddress();

        officeAddress.getAddress();
        officeAddress.setAddress();

        schoolAddress.getAddress();
        schoolAddress.setAddress();
    }
}