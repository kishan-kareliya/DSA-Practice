package collections;

import java.util.HashMap;

public class HashMapCollection {
    public static void main(String args[]){
        HashMap<String,Integer> students = new HashMap<>();

        students.put("kishan",98);
        students.put("rahul",86);
        students.put("urvish",56);

        System.out.println(students);
        System.out.println(students.keySet());
        System.out.println(students.values());

        //retrieve specific element based on key
        System.out.println(students.get("kishan"));

        //remove specific element
        students.remove("kishan");

        //check specific key or value contain or not
        System.out.println(students.containsKey("kishan"));
        System.out.println(students.containsValue(56));
    }
}
