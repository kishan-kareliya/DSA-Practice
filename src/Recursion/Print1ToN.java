package Recursion;

import java.util.Scanner;

public class Print1ToN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();
        print1ToN(num);
    }
    public static void print1ToN(int num){
        if(num > 0){
            print1ToN(num-1);
            System.out.print(num + " ");
        }
    }
}
