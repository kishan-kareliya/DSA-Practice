package starPatterns;
import java.util.Scanner;

// write a program so that output look like this
//     *
//    ***
//   *****
//  *******
// *********

public class q7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        for(int i=0;i<num;i++){
            //spaces
            for(int j=0;j<num-i-1;j++){
                System.out.print(" ");
            }
            //stars
            for(int l=0;l<2*i+1;l++){
                System.out.print("*");
            }
            //spaces
            for(int k=0;k<num-i-1;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
