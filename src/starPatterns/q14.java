package starPatterns;
import java.util.Scanner;

// write a program so that output look like this
// A
// A B
// A B C
// A B C D
// A B C D E

public class q14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        for(int i=0;i<num;i++){
            for(char j='A';j<'A'+i+1;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
