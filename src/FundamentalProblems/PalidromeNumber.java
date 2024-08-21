package FundamentalProblems;

import java.util.Scanner;

public class PalidromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s.nextInt();
        System.out.println(isPalidrome(num));
    }

    public static boolean isPalidrome(int num){
        int lastDigit;
        int reverseNum = 0;
        int copyNum = num;

        while(copyNum>0){
            lastDigit = copyNum % 10;
            reverseNum = (reverseNum*10)+lastDigit;
            copyNum/=10;
        }

        return num==reverseNum;
    }
}
