package FundamentalProblems;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();
        fibonacciSeries(num);
    }
    public static void fibonacciSeries(int num) {
        if(num <= 0) {
            System.out.println("Invalid Fibonacci Number");
            return;
        }
        int a = 0;
        int b = 1;
        System.out.print(a + "," + b);
        for(int i =2;i<num;i++){
            int temp = a;
            a = b;
            b = temp + a;
            System.out.print("," + b);
        }
    }
}
