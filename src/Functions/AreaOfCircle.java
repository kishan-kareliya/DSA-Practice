package Functions;
import java.util.Scanner;

//Write a program to print the circumference and area of a circle
//of radius entered by user by defining your own method.

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius:");
        float radius = s.nextFloat();
        System.out.println(areaOfCircle(radius));
        System.out.println(circumference(radius));
    }
    public static double areaOfCircle(float r){
        return Math.PI * r * r;
    }
    public static double circumference(float r){
        return 2 * Math.PI * r;
    }
}
