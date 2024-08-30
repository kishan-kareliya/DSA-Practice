package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();
        System.out.println(sumOfDigit(num));
    }
    public static int sumOfDigit(int num){
        if(num == 0){
            return 0;
        }
        return num%10 + sumOfDigit(num/10);
    }
}
