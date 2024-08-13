package StarPatterns;
import java.util.Scanner;

// write a program so that output look like this
// *********
//  *******
//   *****
//    ***
//     *

public class q8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        int start = (num*2)-1;
        for(int i=0;i<num;i++){
            //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=0;j<start;j++){
                System.out.print("*");
            }
            //spaces
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            start-=2;
            System.out.println();
        }
    }
}
