package Arrays.Easy;
import java.util.Arrays;

//You are given an array of integers and an integer index.
//Write a function that deletes the element at the specified index from the array.
//The function should return a new array with the element removed,
//while shifting the remaining elements to the left.
//
//  Examples:
//
//  Input:
//  Array: [1, 2, 3, 4, 5]
//  Index to delete: 2
//  Output: [1, 2, 4, 5]
//
//  Input:
//  Array: [7, 8, 9, 10]
//  Index to delete: 1
//  Output: [7, 9, 10]

public class DeleteAtIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        arr = deleteAtIndex(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] deleteAtIndex(int[] arr,int index){
        int[] ans = new int[arr.length-1];

        //copy element before index
        for(int i=0;i<index;i++){
            ans[i] = arr[i];
        }

        //skip index and then copy after index
        for(int i=index;i<ans.length;i++){
            ans[i] = arr[i+1];
        }

        return ans;
    }
}
