package FundamentalProblems;

public class SumofelementsInaMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,0,1,0,8},{0,5,-2,2},{-2,3,1,-4,5}};
        System.out.println("Sum: " + sumMatrix(arr));
    }
    public static int sumMatrix(int[][] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
