// Write a program in java to implement a class Employee having data members
// name, employee_id, salary . Include default, parameterized and copy constructor to
// initialize data members of the class and also copy an employee information.A
// member function show() which is used to display all information about an employee. 
// use inputstreamreader and bufferreader to take input values for the employee

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
    private String name;
    private int employee_id;
    private double salary;

    public Employee() {
        this.name = "";
        this.employee_id = 0;
        this.salary = 0.0;
    }

    public Employee(String name, int employee_id, double salary) {
        this.name = name;
        this.employee_id = employee_id;
        this.salary = salary;
    }

    public Employee(Employee e) {
        this.name = e.name;
        this.employee_id = e.employee_id;
        this.salary = e.salary;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employee_id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter employee name: ");
        String name = br.readLine();

        System.out.print("Enter employee ID: ");
        int employee_id = Integer.parseInt(br.readLine());

        System.out.print("Enter employee salary: ");
        double salary = Double.parseDouble(br.readLine());

        // Creating employee using default constructor
        Employee emp1 = new Employee();
        emp1.show();

        // Creating employee using parameterized constructor
        Employee emp2 = new Employee(name, employee_id, salary);
        emp2.show();

        // Creating employee using copy constructor
        Employee emp3 = new Employee(emp2);
        emp3.show();
    }
}

