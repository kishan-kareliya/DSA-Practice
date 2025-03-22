package collections;
import java.util.*;

public class MatrixListCollection {
    public static void main(String args[]){
        List<List<Integer>> matrix = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(20,25,30)),
                        new ArrayList<>(Arrays.asList(30,35,40))
                )
        );

        matrix.add(Arrays.asList(12,3,45));
        matrix.add(Arrays.asList(20,34,56));
        System.out.println(matrix);
    }
}
