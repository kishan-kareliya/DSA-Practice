package starPatterns;
import java.util.Scanner;

// write a program so that output look like this
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1


public class q11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        int printNum;
        for(int i=1;i<=num;i++){
            if(i%2 == 0) printNum = 0;
            else printNum = 1;

            for(int j=0;j<i;j++){
                System.out.print(printNum);
                printNum = 1 - printNum;
            }
            System.out.println();
        }
    }
}
