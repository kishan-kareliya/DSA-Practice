package FundamentalProblems;
import java.util.Scanner;

// LEETCODE QUESTION NO: 9
// https://leetcode.com/problems/palindrome-number/description/

//Example 1:
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//
//Example 2:
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left,
//it becomes 121-. Therefore it is not a palindrome.
//
//Example 3:
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

//TIME-COMPLEXITY FOR THIS SOLUTION IS: O(log(X))
public class PalidromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s.nextInt();
        System.out.println(isPalidrome(num));
    }

    public static boolean isPalidrome(int num){

        if(num < 0){
            return false;
        }

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
