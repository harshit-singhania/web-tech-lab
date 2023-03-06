// Write a program to create a class Savings_Account. Use a static variable annual_Interest Rate to store the annual interest rate for all account holders. Each object of the class contains a private instance variable savings_Balance indicating the amount the saver currently has on deposit. Provide method calculate_Monthly_Interest to calculate the monthly interest by multiplying the savings_Balance by annual_Interest Rate divided by 12 and this interest should be added to savings_Balance. Provide a static method modify Interest Rate that sets the

// | annual_Interest Rate to a new value. Write a program to test class Savings Account. Instantiate two savings Account objects, saverl & saver2, with balances of $2000.00 and $3000.00 respectively. Set annual Interest Rate to 4%, then calculate the monthly interest and print the new balances for both savers. Then set the annual Interest Rate to 5%, calculate the next month's interest and print the new balances for both savers. 

class Savings_Account {
    private static double annual_Interest_Rate;
    private double savings_Balance;
    
    public Savings_Account(double savings_Balance) {
        this.savings_Balance = savings_Balance;
    }
    
    public void calculate_Monthly_Interest() {
        double monthly_interest = (savings_Balance * annual_Interest_Rate) / 12;
        savings_Balance += monthly_interest;
    }
    
    public static void modify_Interest_Rate(double new_rate) {
        annual_Interest_Rate = new_rate;
    }
    
    public double get_Savings_Balance() {
        return savings_Balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Savings_Account saver1 = new Savings_Account(2000.00);
        Savings_Account saver2 = new Savings_Account(3000.00);
        
        Savings_Account.modify_Interest_Rate(0.04);
        saver1.calculate_Monthly_Interest();
        saver2.calculate_Monthly_Interest();
        System.out.println("Saver1 balance after 1 month: " + saver1.get_Savings_Balance());
        System.out.println("Saver2 balance after 1 month: " + saver2.get_Savings_Balance());
        
        Savings_Account.modify_Interest_Rate(0.05);
        saver1.calculate_Monthly_Interest();
        saver2.calculate_Monthly_Interest();
        System.out.println("Saver1 balance after 2 months: " + saver1.get_Savings_Balance());
        System.out.println("Saver2 balance after 2 months: " + saver2.get_Savings_Balance());
    }
}
