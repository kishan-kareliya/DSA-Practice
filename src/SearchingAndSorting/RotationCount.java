package SearchingAndSorting;

public class RotationCount {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,0,1,2};
        System.out.println(countRotation(arr));
    }
    public static int countRotation(int[] nums){
        int left = 0;
        int right = nums.length - 1;

        while(left<=right){
            int mid = left + (right - left)/2;
            if(mid<right &&nums[mid] > nums[mid+1]){
                return mid+1;
            }
            if(mid > left && nums[mid] < nums[mid-1]){
                return mid;
            }
            if(nums[mid] <= nums[left]){
                right = mid;
            }
            else{
                left = mid + 2;
            }
        }
        return -1;
    }
}
