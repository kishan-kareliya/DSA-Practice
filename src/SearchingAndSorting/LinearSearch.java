package SearchingAndSorting;

public class LinearSearch {
    public static void main(String args[]){
        int[] arr = {12,17,24,89,56,32,13};
        System.out.println(linearSearch(arr,56));
        System.out.println(findMin(arr));
        System.out.println(findMax(arr));
    }
    public static int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
