package SearchingAndSorting;

//LEETCODE QUESTION NO: 268
//https://leetcode.com/problems/missing-number/description/?envType=problem-list-v2&envId=binary-search

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};

        System.out.println("Missing Number is: " + findMissingNum(nums));
    }

    public static int findMissingNum(int[] nums) {
        int ExpectedSum = 0;
        int ActualSum = 0;
        int i;

        /*
        Logic Explanation:
        ------------------
        - The given array contains numbers ranging from 0 to N, but one number is missing.
        - The Expected Sum is the sum of numbers from 0 to N+1 (where N is nums.length) because 1 number is missing.
        - The Actual Sum is the sum of all elements present in the array.
        - Since one number is missing, the difference between Expected Sum and Actual Sum
          will give us the missing number.
        */

        // Calculate Actual Sum from the given array and Expected Sum from 0 to nums.length
        for (i = 0; i < nums.length; i++) {
            ActualSum += nums[i];  // Sum of elements present in the array
            ExpectedSum += i;      // Sum of numbers from 0 to (N-1)
        }

        // Add the last missing number (N) to ExpectedSum
        ExpectedSum += i;

        // The missing number is the difference between Expected and Actual Sum
        return ExpectedSum - ActualSum;
    }
}
