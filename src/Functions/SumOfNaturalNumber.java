package Functions;

import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s.nextInt();
        System.out.println("Sum of Nutral Number till " + num + " is "+sumOfNaturalNumber(num));
    }
    public static int sumOfNaturalNumber(int num){
        int sum = 0;
        for(int i=1;i<=num;i++){
            sum += i;
        }
        return sum;
    }
}
