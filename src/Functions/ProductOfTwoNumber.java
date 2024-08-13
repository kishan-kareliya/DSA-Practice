package Functions;

import java.util.Scanner;

public class ProductOfTwoNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter two Number: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        int ans = product(num1,num2);
        System.out.println("Ans: " + ans);
    }
    public static int product(int a,int b){
        return a*b;
    }
}
