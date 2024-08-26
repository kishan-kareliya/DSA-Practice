package FundamentalProblems;
import java.util.Scanner;

//LEETCODE QUESTION NO: 7
//https://leetcode.com/problems/reverse-integer/description/

//Given a signed 32-bit integer x, return x with its digits reversed.
//If reversing x causes the value to go outside the signed 32-bit integer
//range [-231, 231 - 1], then return 0.
//
//Assume the environment does not allow you to store 64-bit integers
//(signed or unsigned).
//
//Example 1:
//Input: x = 123
//Output: 321
//
//Example 2:
//Input: x = -123
//Output: -321
//
//Example 3:
//Input: x = 120
//Output: 21


//TimeComplexity for this solution is: O(Log(X))
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = s.nextInt();
        System.out.println(reverseNum(num));
    }
    public static int reverseNum(int num){
        boolean isNegative = false;
        int temp = num;
        if(num < 0){
            isNegative = true;
            temp = -num;
        }

        int reverse = 0;

        while(temp > 0){
            int lastdigit = temp % 10;
            if(reverse > (Integer.MAX_VALUE - lastdigit)/10){
                return 0;
            }
            reverse = reverse*10+lastdigit;
            temp /= 10;
        }

        return isNegative ? -reverse : reverse;
    }
}
