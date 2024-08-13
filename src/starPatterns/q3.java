package starPatterns;

// write a program so that output look like this
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        for(int i=0;i<num;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
