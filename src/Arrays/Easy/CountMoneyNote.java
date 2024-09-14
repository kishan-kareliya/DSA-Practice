package Arrays.Easy;
import java.util.Scanner;

//Count Minimum Number of Money Notes
//Write a program that takes an integer input representing an amount of money
//and prints how many notes of each denomination are required to make up that amount.
//The available denominations are 500, 200, 100, 50, 20, 10, 5, 2, and 1.
//
//The program should break the amount down into the smallest number of notes possible
//for each denomination and print the number of each note needed.
//
//Example 1:
//
//Input:
//Enter Amount: 575
//
//Output:
//        500 rupees notes: 1
//        50 rupees notes: 1
//        20 rupees notes: 1
//        5 rupees notes: 1
//
//Example 2:
//
//Input:
//Enter Amount: 289
//
//Output:
//        200 rupees notes: 1
//        50 rupees notes: 1
//        20 rupees notes: 1
//        10 rupees notes: 1
//        5 rupees notes: 1
//        2 rupees notes: 2

public class CountMoneyNote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter Amount: ");
        int amount = s.nextInt();
        countMoneyNote(amount);
    }
    public static void countMoneyNote(int amount){
        int[] notes = {500,200,100,50,20,10,5,2,1};
        int i = 0;
        while(amount!=0){
            if(amount/notes[i]!=0)
                System.out.println(notes[i] + " rupees notes: " + amount/notes[i]);

            amount = amount%notes[i];
            i++;
        }
    }
}
