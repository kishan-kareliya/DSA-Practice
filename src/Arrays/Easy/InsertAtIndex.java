package Arrays.Easy;
import java.util.Arrays;

//You are given an array of integers and an integer value.
//Write a function that inserts the given value at a specified index in the array.
//The function should return a new array with the value inserted at the correct position,
//while shifting the rest of the elements to the right.
//The original array should not be modified.

//Examples:
//
//  Input:
//  Array: [1, 2, 3, 4, 5]
//  Value to insert: 12
//  Index: 2
//  Output: [1, 2, 12, 3, 4, 5]
//
//  Input:
//  Array: [7, 8, 9]
//  Value to insert: 15
//  Index: 1
//  Output: [7, 15, 8, 9]

public class InsertAtIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = insertAtIndex(arr,12,2);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] insertAtIndex(int[] arr,int value,int index) {
        int[] ans = new int[arr.length + 1];

        //copy element in new array
        for(int i=0;i<index;i++){
            ans[i] = arr[i];
        }

        //insert value at specific index
        ans[index] = value;

        //insert value after index
        for(int i=index;i<arr.length;i++){
            ans[i+1] = arr[i];
        }

        return ans;
    }
}
