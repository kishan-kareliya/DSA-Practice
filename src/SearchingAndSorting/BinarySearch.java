package SearchingAndSorting;

public class BinarySearch {
    public static void main(String args[]) {
        int[] arr = {12, 13, 14, 15, 16, 17, 18};

        binarySearch(arr, 14);
    }
    static void binarySearch(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid] == target){
                System.out.println(target+" found at index "+mid);
                return;
            }
            else if(arr[mid]<target){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        System.out.println(target + " not found");
        return;
    }
}
