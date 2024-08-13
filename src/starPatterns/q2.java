package starPatterns;

// write a program so that output look like this
// *
// * *
// * * *
// * * * *
// * * * * *

import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        for(int i=0;i<num;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
