import java.util.Scanner;

class Employee {
    protected String name;
    protected int id;
    protected double salary;

    public void get_data() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        name = input.nextLine();
        System.out.print("Enter employee ID: ");
        id = input.nextInt();
    }

    public void put_data() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee ID: " + id);
    }

    public void calculate_salary() {
        System.out.println("Salary: " + salary);
    }
}

class Regular extends Employee {
    protected double basic_salary;
    protected double da;
    protected double hra;

    public void get_data() {
        super.get_data();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        basic_salary = input.nextDouble();
        System.out.print("Enter DA: ");
        da = input.nextDouble();
        System.out.print("Enter HRA: ");
        hra = input.nextDouble();
    }

    public void calculate_salary() {
        salary = basic_salary + da + hra;
        super.put_data();
        System.out.println("Regular employee salary: " + salary);
    }
}

class PartTime extends Employee {
    protected double pay_per_hour;
    protected double hours_worked;

    public void get_data() {
        super.get_data();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter pay per hour: ");
        pay_per_hour = input.nextDouble();
        System.out.print("Enter hours worked: ");
        hours_worked = input.nextDouble();
    }

    public void calculate_salary() {
        salary = pay_per_hour * hours_worked;
        super.put_data();
        System.out.println("Part-time employee salary: " + salary);
    }
}

public class Two {
    public static void main(String[] args) {
        Regular r = new Regular(); 
        PartTime pt = new PartTime(); 

        // call all methods for both classes
         r.get_data(); 
         r.calculate_salary(); 

         pt.get_data(); 
         pt.calculate_salary();
    }
}
