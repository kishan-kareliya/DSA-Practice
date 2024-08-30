package Recursion;

public class PrintGFGNTimes {
    public static void main(String[] args) {
        printGFG(10);
    }
    public static void printGFG(int num){
        if(num > 0){
            printGFG(num-1);
            System.out.print("GFG ");
        }
    }
}
