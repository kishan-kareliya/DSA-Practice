
import java.util.Scanner;

class AutomorphicNumber{

    public static boolean isAutomorphic(int num){
        int temp = num;
        int square = num * num;

        while(square > 0 && temp > 0){
            int lastDigitOfSquare = square % 10;
            int lastDigitOfNumber = temp % 10;

            if(lastDigitOfNumber != lastDigitOfSquare){
                return false;
            }

            square /= 10;
            temp /= 10;
        }

        return true;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        System.out.println(isAutomorphic(num));
    }
}