package StarPatterns;

// write a program so that output look like this
// 1
// 2 2
// 3 3 3
// 4 4 4 4
// 5 5 5 5 5

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        for(int i=0;i<num;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(i+1 + " ");
            }
            System.out.println();
        }
    }
}
