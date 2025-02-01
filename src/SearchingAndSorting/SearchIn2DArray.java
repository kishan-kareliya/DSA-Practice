package SearchingAndSorting;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {12,14,15,53,67},
                {26,64,62,78,32},
                {235,237,788,344}
        };
        SearchAt(arr,788);
    }
    public static void SearchAt(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]  == target){
                    System.out.println("Element "+target+" found at ["+i+"]["+j+"] index");
                }
            }
        }
        System.out.println("Element not found");
    }
}
