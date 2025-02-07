package SearchingAndSorting;

public class SearchInInfinityArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170, 200};
        int target = 170;
        System.out.println(ans(arr, target));
    }

    public static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Expand the window until arr[end] is >= target
        while (arr[end] < target) {
            int newStart = end + 1;
            // Expand the window size exponentially
            end = end + (end - start + 1) * 2;
            start = newStart;

            // To prevent going out of the array's bounds (if the array were finite)
            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }
        }

        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid; // Target found at index mid
            }
        }
        return -1; // Target not found
    }
}
