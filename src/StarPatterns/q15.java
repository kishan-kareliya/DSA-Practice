package StarPatterns;
import java.util.Scanner;

// write a program so that output look like this
// A B C D E
// A B C D
// A B C
// A B
// A

public class q15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = s.nextInt();

        for(int i=0;i<num;i++){
            for(char j='A';j<'A'+num-i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
