package Arrays.Easy;

// LEETCODE QUESTION NO: 1929
// LEETCODE LINK: https://leetcode.com/problems/concatenation-of-array/description/
//Given an integer array nums of length n, you want to create an array ans of length 2n
//where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Example 1:
//
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
//Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//        - ans = [1,2,1,1,2,1]
//Example 2:
//
//Input: nums = [1,3,2,1]
//Output: [1,3,2,1,1,3,2,1]
//Explanation: The array ans is formed as follows:
//        - ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
//        - ans = [1,3,2,1,1,3,2,1]

import java.util.Arrays;

public class ConcatinationArray {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        nums = concatinationArray(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] concatinationArray(int[] nums){
        int[] ans = new int[2*nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
