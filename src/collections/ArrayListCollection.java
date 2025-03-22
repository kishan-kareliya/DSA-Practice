package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCollection {
    public static void main(String args[]){
        List<String> names = new ArrayList<>(Arrays.asList("kishan","rahul","vraj"));

        //insert values in arraylist
        names.add("Apple");
        names.add("Banana");
        names.add("Orange");
        names.add("Cherry");
        //insert at specific index
        names.add(1,"Pineapple");
        System.out.println(names);

        //remove at specific index
        names.remove("Banana");
        System.out.println(names);

        //update at specific index
        names.set(1,"bananas");
        System.out.println(names);

        //check specific value exist or not
        System.out.println(names.contains("Apple"));
    }
}
