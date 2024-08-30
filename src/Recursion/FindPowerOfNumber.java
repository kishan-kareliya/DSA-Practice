package Recursion;

import java.util.Scanner;

public class FindPowerOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();
        System.out.print("Enter Power: ");
        int power = s.nextInt();
        System.out.println("Ans: " + pow(num,power));
    }
    public static int pow(int num,int power){
        if(power == 0){
            return 1;
        }
        return num*pow(num,power-1);
    }
}
