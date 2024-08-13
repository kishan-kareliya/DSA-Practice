package Functions;

// Define two methods to print the maximum and the
// minimum number respectively among three numbers entered by the user.

public class MaximumAndMInimum {
    public static void main(String[] args) {
        System.out.println("Max: "+ max(52,30,34));
        System.out.println("Min: "+min(21,53,54));
    }
    public static int max(int num1,int num2,int num3){
        if(num1>num2){
            if(num1>num3){
                return num1;
            }
            else{
                return num3;
            }
        }
        if(num2>num1){
            if(num2>num3){
                return num2;
            }
            else{
                return num3;
            }
        }
        return 0;
    }
    public static int min(int num1,int num2,int num3){
        if(num1<num2){
            if(num1<num3){
                return num1;
            }
            else{
                return num3;
            }
        }
        if(num2<num1){
            if(num2<num3){
                return num2;
            }
            else{
                return num3;
            }
        }
        return 0;
    }
}
