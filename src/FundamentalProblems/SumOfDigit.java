package FundamentalProblems;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        long num = s.nextLong();

        System.out.println("Ans: "+ sumOfdigit(num));
    }

    public static long sumOfdigit(long num){
        if(num<0){
            return 0;
        }
        long sum = 0;
        long copyNum = num;
        long lastDigit;

        while(copyNum > 0){
            lastDigit = copyNum % 10;
            sum += lastDigit;
            copyNum /= 10;
        }

        return sum;
    }
}
