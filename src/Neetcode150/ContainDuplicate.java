package Neetcode150;

//Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
//
//Example 1:
//Input: nums = [1, 2, 3, 3]
//Output: true

import java.util.ArrayList;

public class ContainDuplicate {
    public static boolean checkDuplicate(int[] nums){
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(numbers.contains(nums[i])){
                return true;
            }
            numbers.add(nums[i]);
        }
        return false;
    }
    public static void main(String args[]){
        int[] nums = {1,2,3,4,5};
        System.out.println(checkDuplicate(nums));
    }
}
