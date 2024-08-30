package Recursion;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s.nextInt();
        System.out.println(reverse(num));
    }
    public static int reverse(int num){
        if(num <= 0){
            return 0;
        }
        int digits = (int)Math.log10(num);
        return (num%10)*(int)(Math.pow(10,digits)) + reverse(num/10);
    }
}
