package Neetcode150;
import java.util.Arrays;

public class ProductNumberExceptSelf {
    public static int[] productNumberExceptSelf(int[] nums){
        int[] ans = new int[nums.length];
        ans[0] = 1;
        for(int i=1;i<nums.length;i++){
            ans[i] = nums[i-1] * ans[i-1];
        }
        int suffix = 1;
        for(int i=nums.length-2;i>=0;i--){
            suffix *= nums[i+1];
            ans[i] *= suffix;
        }

        return ans;
    }
    public static void main(String args[]){
        int[] num = {1,2,3,4,5};
        System.out.println(Arrays.toString(productNumberExceptSelf(num)));
    }
}
