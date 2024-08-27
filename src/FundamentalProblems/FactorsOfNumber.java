package FundamentalProblems;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num1 = s.nextInt();
        findFactors(num1);
    }
    public static void findFactors(int num1){
        for(int i=1;i<=Math.sqrt(num1);i++){
            if(num1%i == 0){
                System.out.println(i);
                if(i != (num1/i)){
                    System.out.println(num1/i);
                }
            }
        }
    }
}
