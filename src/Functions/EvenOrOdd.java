package Functions;

//Define a program to find out whether a given number is even or odd.

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.println(check(2));
    }
    public static String check(int num){
        if(num%2 == 0){
            return "Even";
        }
        return "Odd";
    }
}
