package Neetcode150;

import java.util.HashMap;
import java.util.Arrays;

//Given an array of integers nums and an integer target, return the indices i and j such that
//nums[i] + nums[j] == target and i != j.
//You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
//Return the answer with the smaller index first.
//
//Example 1:
//Input:
//nums = [3,4,5,6], target = 7
//
//Output: [0,1]

public class TwoSum {
    public static int[] checkTwoSum(int[] nums,int target){
        HashMap<Integer,Integer> numbers = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int difference = target - nums[i];
            if(numbers.containsKey(difference)){
                return new int[] {numbers.get(difference),i};
            }
            numbers.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
    public static void main(String args[]){
        int[] nums = {3,4,5,8,9};
        System.out.println(Arrays.toString(checkTwoSum(nums,7)));
    }
}
