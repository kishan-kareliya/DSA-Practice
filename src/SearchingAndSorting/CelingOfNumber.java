package SearchingAndSorting;

public class CelingOfNumber {
    public static void main(String args[]) {
        int[] arr = {12, 13, 15, 16,18, 20};

        System.out.println(findCelingOfNumber(arr, 13));
    }
    public static int findCelingOfNumber(int[] arr,int target){
        int left = 0;
        int right = arr.length - 1;

        while(left<=right){
            int mid = (left + right)/2;
            if(arr[mid] == target){
                return arr[mid];
            }
            else if(arr[mid]>target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return arr[left];
    }
}
