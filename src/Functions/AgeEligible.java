package Functions;

//A person is eligible to vote if his/her age is greater than or equal to 18.
//Define a method to find out if he/she is eligible to vote.

public class AgeEligible {
    public static void main(String[] args) {
        boolean check = checkEligiblity(15);
        System.out.println(check);
    }
    public static boolean checkEligiblity(int age){
        if(age>18){
            return true;
        }
        return false;
    }
}
