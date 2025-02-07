package SearchingAndSorting;

//LEETCODE QUESTION NO: 34:
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
//Given an array of integers nums sorted in non-decreasing order,
//find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//
//Input: nums = [], target = 0
//Output: [-1,-1]

import java.util.Arrays;

public class FirstAndLastPositionOfElement {
    public static void main(String args[]){
        int[] nums = {5,7,7,8,8,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums,8)));
    }
    public static int[] searchRange(int nums[],int target){
        int[] ans = {-1,-1};

        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;
    }
    public static int search(int[] nums,int target,boolean findStartIndex){
        int ans = -1;
        int left = 0;
        int right = nums.length - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(nums[mid] < target){
                left = mid + 1;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                ans = mid;
                if(findStartIndex){
                    right = mid - 1;
                }
                else{
                    left = mid + 1;
                }
            }
        }
        return ans;
    }
}
