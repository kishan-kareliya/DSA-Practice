package Arrays.Easy;
import java.util.Arrays;

// LEETCODE QUESTION NO: 1480
// LEETCODE LINK: https://leetcode.com/problems/running-sum-of-1d-array/description/
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//Return the running sum of nums.
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
//Example 2:
//
//Input: nums = [1,1,1,1,1]
//Output: [1,2,3,4,5]
//Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
//Example 3:
//
//Input: nums = [3,1,2,10,1]
//Output: [3,4,6,16,17]

public class RunningSumOfArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        nums = runningSumOfArray(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static int[] runningSumOfArray(int[] nums){
        int sum = 0;
        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            ans[i] = sum;
        }
        return ans;
    }
}
