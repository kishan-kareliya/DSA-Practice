package starPatterns;
import java.util.Scanner;

// *****
// *   *
// *   *
// *   *
// *****

public class q21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(i==0 || i==num-1 || j==0 || j==num-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
