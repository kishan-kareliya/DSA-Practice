package Functions;
import java.util.Scanner;

//Write a Java program that prompts the user to enter a number n, and then calculates
//and prints the sum of the first n odd numbers. The program should also
//display each of these odd numbers in the format: 1 + 3 + 5 + ... = sum.
//
//For example, if the user inputs 4, the output should be:
//Copy code
//1 + 3 + 5 + 7 = 16

public class SumOfFirstOddNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();
        int ans = sumOfFirstOddNumber(num);
        int j=1;
        for(int i=0;i<num;i++){
            System.out.print(j + "+");
            j+=2;
        }
        System.out.print("\b="+ ans);
    }

    public static int sumOfFirstOddNumber(int num){
        int i=0;
        int j=1;
        int sum = 0;
        while(i<num){
            sum += j;
            j+=2;
            i++;
        }
        return sum;
    }

}

