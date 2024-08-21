package FundamentalProblems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();
        System.out.println(checkPerfect(num));
    }

    public static boolean checkPerfect(int num){
        if(num<2){
            return false;
        }
        long sum = 1;

        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i == 0){
                sum += i;

                //check another divisior corresponding to that
                if(i != num/i){
                    sum += num/i;
                }
            }
        }

        return num == sum;
    }
}
