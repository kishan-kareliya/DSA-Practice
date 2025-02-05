package OOPSConcepts;

import java.util.Scanner;

abstract class BaseEmployee{

    Scanner s = new Scanner(System.in);

    String name;
    static String companyName = "TechCorp";

    //parameterized constructor
    BaseEmployee(String name){
        this.name = name;
    }

    //static method
    static void displayCompanyName(){
        System.out.println("Company Name: " + companyName);
    }

    void showEmployeeInfo(){
        System.out.println("Employee Name: " + name);
    }

    abstract void calculateSalary();
}

class FullTimeEmployee extends BaseEmployee{

    FullTimeEmployee(String name){
        super(name);
    }

    void calculateSalary(){
        double salary = 5000.0;
        System.out.println("Salary " + salary);
    }
}

class PartTimeEmployee extends BaseEmployee{

    PartTimeEmployee(String name){
        super(name);
    }

    void calculateSalary(){
        int hours = 0;
        double salary;

        System.out.print("Enter Hours You Worked: ");
        hours = s.nextInt();
        s.nextLine();

        salary = (double)hours*20;

        System.out.println("Salary " + salary);
    }
}

public class PayrollMain {
    public static void main(String args[]){

        BaseEmployee.displayCompanyName();
        System.out.println();

        System.out.println("Full-Time Employee:");
        FullTimeEmployee f = new FullTimeEmployee("John Doe");
        f.showEmployeeInfo();
        f.calculateSalary();
        System.out.println();

        System.out.println("Part-Time Employee:");
        PartTimeEmployee p = new PartTimeEmployee("Alice");
        p.showEmployeeInfo();
        p.calculateSalary();
    }
}
