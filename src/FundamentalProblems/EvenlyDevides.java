package FundamentalProblems;
import java.util.Scanner;

//Given a number n. Count the number of digits in n which evenly divide n.
//Return an integer, total number of digits of n which divides n evenly.
//
//Note :- Evenly divides means whether n is divisible by a digit
//i.e. leaves a remainder 0 when divided.
//
//Examples :
//
//Input: n = 12
//Output: 2
//Explanation: 1, 2 when both divide 12 leaves remainder 0.
//
//Input: n = 2446
//Output: 1
//Explanation: Here among 2, 4, 6 only 2 divides 2446 evenly while 4 and 6 do not.
//
//Input: n = 23
//Output: 0
//Explanation: 2 and 3, none of them divide 23 evenly.


public class EvenlyDevides {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = s.nextInt();
        System.out.println(checkEvenlyDevide(num));
    }

    public static int checkEvenlyDevide(int num ){
        int temp = num;
        int count = 0;
        int lastdigit;

        while(temp > 0){
            lastdigit = temp % 10;
            if(lastdigit != 0 && num % lastdigit == 0){
                count++;
            }
            temp /= 10;
        }
        return count;
    }
}
