package SearchingAndSorting;
//
//LEETCODE QUESTION NO: 852
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
//
//Example 1:
//Input: arr = [0,1,0]
//Output: 1
//
//Example 2:
//Input: arr = [0,2,1,0]
//Output: 1
//
//Example 3:
//Input: arr = [0,10,5,2]
//Output: 1

public class FindPeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,10,20,50,35,22,12,10,5,2};
        System.out.println(findPeak(arr));
    }
    public static int findPeak(int[] arr){
        int left = 0;
        int right = arr.length;

        while(left<right){
            int mid = left + (right - left)/2;
            if(arr[mid]>arr[mid+1]){
                right = mid;
            }
            else{
                left = mid+1;
            }
        }
        return arr[right];
    }
}
