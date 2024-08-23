package FundamentalProblems;

import java.util.Scanner;

public class RotateNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();
        rotate(num);
    }
    public static void rotate(int num){
        int digits = 0;
        int temp = num;
        while(temp>0){
            digits++;
            temp /= 10;
        }
        int rotateNum = num;
        do{
            int remainder = rotateNum % 10;
            int devisable = rotateNum / 10;

            rotateNum = (int)((Math.pow(10,digits-1)*remainder)+devisable);

            System.out.println(rotateNum);
        }while(rotateNum != num);
    }
}
