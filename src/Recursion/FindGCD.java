package Recursion;
import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number 1: ");
        int num1 = s.nextInt();
        System.out.print("Enter Number 2: ");
        int num2 = s.nextInt();
        System.out.println("GCD: "+findGCD(num1,num2));
    }
    public static int findGCD(int num1,int num2){
        if(num2 == 0)
            return num1;
        return findGCD(num2,num1%num2);
    }
}
