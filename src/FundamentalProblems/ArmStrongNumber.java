package FundamentalProblems;

import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();
        System.out.println(checkArmStrong(num));
    }
    public static int power(int base,int exponenet){
        int result = 1;
        if(exponenet == 0){
            return result;
        }
        for(int i=0;i<exponenet;i++){
            result *= base;
        }
        return result;
    }
    public static boolean checkArmStrong(int num){
        int temp = num;
        int ans = 0;
        int lastDigit;

        //calculate number of digit
        int numberOfDigit = String.valueOf(num).length();

        while(temp>0){
            lastDigit = temp % 10;
            ans += power(lastDigit,numberOfDigit);
            temp /= 10;
        }
        return ans == num;
    }
}
