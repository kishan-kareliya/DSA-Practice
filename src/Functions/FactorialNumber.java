package Functions;
import java.util.Scanner;

//Write a program to print the factorial of a number by defining
//a method named 'Factorial'. Factorial of any number n is represented by n!

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = s.nextInt();
        factorial(number);
    }
    public static void factorial(int number){
        int ans=1;
        if(number == 0 || number==1){
            System.out.println(ans);
        }
        else{
            for(int i=1;i<=number;i++){
                ans *= i;
            }
            System.out.println(ans);
        }
    }
}
