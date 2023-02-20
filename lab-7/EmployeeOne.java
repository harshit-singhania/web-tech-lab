// Write a program in java to class EmployeeOne having private data members ID, company_name and salary.Create a nested class called programmer which have
// get_Emp_details() which access private data members of Employee class and get employee
// details and display_Emp_details() function to display employee details.Take appropriate
// member functions if required and work on the following. A. Inner class
// B. Static Nested class
// C. Method local inner class
// D. Annonymous inner class

public class EmployeeOne {
    private int ID; 
    private String company_name; 
    private double salary;  

    public EmployeeOne(int ID, String company_name, double salary) {
        this.ID = ID;
        this.company_name = company_name; 
        this.salary = salary; 
    } 

    // inner class 
    public class Programmer {
        public void get_Emp_details() {
            System.out.println("Employee ID : "+ ID); 
            System.out.println("Company name : "+company_name); 
            System.out.println("Salary : "+salary);
        }
        public void display_Emp_details() {
            get_Emp_details();
        }
    }

    // static nested class 
    public static class Manager {
        public void display_Emp_details(EmployeeOne e) {
            System.out.println("Employee Details:");
            System.out.println("Employee ID: " + e.ID);
            System.out.println("Company Name: " + e.company_name);
            System.out.println("Salary: " + e.salary);
        }
    }

    // method local inner class 
    public void display_Emp_details_second() {
        class EmployeeDetails {
            public void display(EmployeeOne e) {
                System.out.println("Employee Details:");
                System.out.println("Employee ID: " + e.ID);
                System.out.println("Company Name: " + e.company_name);
                System.out.println("Salary: " + e.salary);
            }
        }
        EmployeeDetails empDetails = new EmployeeDetails(); 
        empDetails.display(this);
    }

    // Anonymous inner class 
    public void display_Emp_details_Anonymous() {
        Programmer p = new Programmer() {
            public void display_Emp_details() {
                System.out.println("Employee Details:");
                get_Emp_details();
            }
        };
        p.display_Emp_details();
    }

    public static void main(String[] args) {
        EmployeeOne e1 = new EmployeeOne(123, "Tesla Inc", 1000); 
        e1.display_Emp_details_second();

        EmployeeOne e2 = new EmployeeOne(125, "Berkshire Hathaway", 2000); 
        Manager m = new Manager(); 
        m.display_Emp_details(e2); 

        EmployeeOne e3 = new EmployeeOne(124, "Google", 123098); 
        e3.display_Emp_details_Anonymous();
    }
}
