package FundamentalProblems;
import java.util.Scanner;

public class GcdAndLcmOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int num1 = s.nextInt();
        System.out.print("Enter second Number: ");
        int num2 = s.nextInt();

        System.out.println("GCD: " + findGCD(num1,num2));
        System.out.println("LCM: " + findLCM(num1,num2));
    }
    public static int findGCD(int num1,int num2){
        while(num1 > 0 && num2 > 0){
            if(num1 > num2)
                num1 = num1 % num2;
            else
                num2 = num2 % num1;
        }
        return num1 == 0 ? num2 : num1;
    }
    public static int findLCM(int num1,int num2){
        int lcm = (num1*num2)/findGCD(num1,num2);
        return lcm;
    }
}
