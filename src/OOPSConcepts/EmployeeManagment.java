package OOPSConcepts;
import java.util.Scanner;

abstract class Employee{
    String name,id;
    int experience;
    double baseSalary;
    final static String companyName = "GlobalTech";

    Employee(String id,String name,double baseSalary,int experience){
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
        this.experience = experience;
    }

    static void displayCompanyInfo(){
        System.out.println("Company: " + companyName);
    }

    void displayEmployeeDetails(){
        System.out.println("Employee Details:");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: " + baseSalary);
        System.out.println("Experience : " + experience + " years");
    }

    abstract void calculateFinalSalary();

}

class FullEmployee extends Employee{

    FullEmployee(String id, String name,double baseSalary,int experience){
        super(id,name,baseSalary,experience);
    }

    void calculateFinalSalary(){
        double finalSalary = baseSalary + (float)(experience*1000) - 500;
        System.out.println("Final Salary (Full-Time): " + finalSalary);
    }
}

class ContractEmployee extends Employee{

    ContractEmployee(String id,String name,double baseSalary,int experience){
        super(id,name,baseSalary,experience);
    }

    void calculateFinalSalary(){
        Scanner s = new Scanner(System.in);
        int hourlyRate,hoursWorked;
        double finalSalary;

        System.out.print("Enter hourly rate: ");
        hourlyRate = s.nextInt();

        System.out.print("Enter hours worked:");
        hoursWorked = s.nextInt();

        finalSalary = (hourlyRate*hoursWorked) + (experience*500);

        System.out.println("Final Salary (Contract-Based): " + finalSalary);
    }
}

public class EmployeeManagment {
    public static void main(String[] args){
        Employee.displayCompanyInfo();
        System.out.println();

        FullEmployee f = new FullEmployee("E101","John Doe",5000.0,3);
        f.displayEmployeeDetails();
        f.calculateFinalSalary();

        System.out.println();
        ContractEmployee c = new ContractEmployee("E102","Alice",0.0,2);
        c.displayEmployeeDetails();
        c.calculateFinalSalary();
    }
}
