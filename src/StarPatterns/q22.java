package StarPatterns;

import java.util.Scanner;

public class q22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();
        printPattern(num);
    }
    public static int square(int num){
        return num*num;
    }
    public static void printPattern(int num){
        for(int i=0;i<num;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            //numbers
            for(int j=0;j<num-i;j++){
                System.out.print(" " + square(j+1));
            }
            System.out.println();
        }
    }
}
