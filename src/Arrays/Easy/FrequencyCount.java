package Arrays.Easy;
import java.util.Arrays;

//You are given an unsorted array of integers. Your task is to determine
//how many times each unique element appears in the array and print the results.

//Input: [1, 2, 2, 4, 5, 3, 1, 3, 5, 5]
//Output:
//1 repeats 2 times
//2 repeats 2 times
//3 repeats 2 times
//4 repeats 1 time
//5 repeats 3 times

public class FrequencyCount {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4,5,3,1,3,5,5};
        CheckFrequency(arr);
    }
    public static void CheckFrequency(int[] arr){
        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            int count = 1;
            while(i+1<arr.length && arr[i] == arr[i+1]){
                count++;
                i++;
            }
            System.out.println(arr[i] + " repeats " + count + " times");
        }
    }
}
