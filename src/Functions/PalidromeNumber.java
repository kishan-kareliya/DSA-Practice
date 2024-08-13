package Functions;
import java.util.Scanner;

//Write a function to find if a number is a palindrome or not. Take number as parameter.

public class PalidromeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(checkPalindrome(num));
    }
    public static boolean checkPalindrome(int num){
        int checkNum = num;
        int ans=0;
        int lastDigit;
        for(int i=0;i<3;i++){
            lastDigit = num%10;
            ans = ans * 10 + lastDigit;
            num/=10;
        }
        if(checkNum==ans){
            return  true;
        }
        return false;
    }
}
