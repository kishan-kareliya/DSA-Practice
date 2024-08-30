package Recursion;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();
        printNto1(num);
    }
    public static void printNto1(int num){
        if(num == 0){
            return;
        }
        System.out.print(num + " ");
        printNto1(num - 1);
    }
}
