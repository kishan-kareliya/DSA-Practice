package FundamentalProblems;

import java.util.Scanner;

public class CircularPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s.nextInt();
        System.out.println(isCircularPrime(num));
    }
    public static boolean isPrime(int num){
        //so 0 and 1 is not prime so directly return false
        if(num == 0 || num == 1)
            return false;
        //only 2 Even number is prime so if it is 2 then return true
        //or anyother number which is even then return false
        if(num == 2)
            return true;
        if(num % 2 == 0)
            return false;
        //if number is not even or not 0,1,2 then enter into loop
        //to check whether it is prime or not
        for(int i=3;i<=Math.sqrt(num);i++){
            if(num % i == 0)
                return false;
        }
        return true;
    }
    public static boolean isCircularPrime(int num){
        int temp = num;
        int count = 0;
        while(temp>0){
            count++;
            temp/=10;
        }
        int copyNum = num;
        while(isPrime(copyNum)){
            int rem = copyNum % 10;
            int dev = copyNum / 10;
            copyNum = (int)((Math.pow(10,count-1)*rem) + dev);

            if(copyNum == num)
                return true;
        }
        return false;
    }
}
