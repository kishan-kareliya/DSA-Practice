package starPatterns;
import java.util.Scanner;

// write a program so that output look like this
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15


public class q13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        int count = 1;
        for(int i=0;i<num;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
