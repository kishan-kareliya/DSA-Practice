package collections;

import java.util.LinkedList;
import java.util.List;

public class LInkedListCollection {
    public static void main(String args[]){
        List<String> list1 = new LinkedList<>();

        //insert methods
        list1.add("A");
        list1.addFirst("B");
        list1.addLast("C");
        System.out.println(list1);

        //remove methods
        list1.remove("A");
        //list1.removeFirst();
        //list1.removeLast();
        System.out.println(list1);

        //check value exist or not
        System.out.println(list1.contains("B"));
        System.out.println(list1.get(1));
    }
}
