package SearchingAndSorting;

import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9,10,11,12,13,1,2,3};
        int pivot = findPivot(nums);

        int existAtLeft = binarySearch(nums,8,0,pivot);
        if(existAtLeft != -1){
            System.out.println(existAtLeft);
        }

        int existAtRight = binarySearch(nums,8,pivot+1,nums.length-1);
        if(existAtRight != -1){
            System.out.println(existAtRight);
        }
    }

    public static int findPivot(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while(left<=right){
            int mid = left + (right - left)/2;
            if(mid<right &&nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > left && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[mid] <= nums[left]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums,int target,int start,int end){

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
