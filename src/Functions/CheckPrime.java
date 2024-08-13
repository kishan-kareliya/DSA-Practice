package Functions;
import java.util.Scanner;

//Define a method to find out if a number is prime or not.

public class CheckPrime {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = s.nextInt();
        System.out.println(checkPrime(number));
    }
    public static String checkPrime(int num){
        int i = 2;
        while(i<=Math.sqrt(num)){
            if(num % i == 0){
                return "Not Prime";
            }
            i++;
        }
        return "Prime";
    }
}
