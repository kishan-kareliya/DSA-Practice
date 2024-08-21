package FundamentalProblems;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();
        int ans = fibonacciNumber(num);
        System.out.println(ans);
    }
    public static int fibonacciNumber(int num){
        int a = 0;
        int b = 1;
        if(num == 0){
            return a;
        }
        else{
            for(int i=1;i<num;i++){
                int temp = a;
                a = b;
                b = temp + a;
            }
            return b;
        }
    }
}
