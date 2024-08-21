package FundamentalProblems;
import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        System.out.println(isStrongNumber(num));
    }

    public static int fact(int n){
        if(n == 0 || n==1){
            return 1;
        }
        int mul = 1;
        for(int i=2;i<=n;i++){
            mul *= i;
        }
        return mul;
    }

    public static boolean isStrongNumber(int num){
        int sum = 0;
        int lastdigit;
        int copyNum = num;

        while(copyNum > 0){
            lastdigit = copyNum % 10;
            sum += fact(lastdigit);
            copyNum /= 10;
        }

        return num==sum;
    }
}
