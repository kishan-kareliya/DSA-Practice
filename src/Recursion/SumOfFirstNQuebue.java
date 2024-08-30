package Recursion;
import java.util.Scanner;

//Given an integer n, calculate the sum of series 1^3 + 2^3 + 3^3 + 4^3 + …
//till n-th term.
//
//Example 1:
//
//Input:
//n=5
//Output:
//225
//Explanation:
//1^3+2^3+3^3+4^3+5^3=225

public class SumOfFirstNQuebue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println(sumOfFirstQuebue(num));
    }
    public static int quebue(int num){
        return num*num*num;
    }
    public static int sumOfFirstQuebue(int num){
        if(num == 0){
            return 0;
        }
        return quebue(num)+sumOfFirstQuebue(num-1);
    }
}
