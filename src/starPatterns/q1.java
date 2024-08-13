package starPatterns;

// write a program so that output look like this
// * * * * *
// * * * * *
// * * * * *
// * * * * *
// * * * * *

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
