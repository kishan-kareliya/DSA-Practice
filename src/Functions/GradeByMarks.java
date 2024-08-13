package Functions;
import java.util.Scanner;

//Write a program that will ask the user to enter his/her marks (out of 100).
//Define a method that will display grades according to the marks entered as below:
//
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail

public class GradeByMarks {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        float marks = s.nextFloat();
        System.out.println(checkGrade(marks));
    }

    public static String checkGrade(float marks){
        if(marks>90 && marks<=100){
           return "AA";
        }
        else if(marks>80 && marks<=90){
            return "AB";
        }
        else if(marks>70 && marks<=80){
            return "BB";
        }
        else if(marks>60 && marks<=70){
            return "BC";
        }
        else if(marks>50 && marks<=60){
            return "CD";
        }
        else if(marks>40 && marks<=50){
            return "DD";
        }
        else if(marks<=40){
            return "Fail";
        }
        return "Invalid Marks";
    }
}
