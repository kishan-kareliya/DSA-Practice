package StarPatterns;
import java.util.Scanner;

// write a program so that output look like this
// A
// B B
// C C C
// D D D D
// E E E E E

public class q16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        char ch = 'A';
        for(int i=0;i<num;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
    }
}
