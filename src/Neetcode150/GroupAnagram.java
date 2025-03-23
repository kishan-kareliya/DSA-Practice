package Neetcode150;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class GroupAnagram {
    public static List<List<String>> groupAnagram(String[] strs){
        HashMap<String,List<String>> anagrams = new HashMap<>();

        for(String str : strs){
            char[] characters = str.toCharArray();
            Arrays.sort(characters);
            String sortedString = new String(characters);

            if(!anagrams.containsKey(sortedString)){
                anagrams.put(sortedString,new ArrayList<>());
            }

            anagrams.get(sortedString).add(str);
        }

        return new ArrayList<>(anagrams.values());
    }

    public static void main(String args[]){
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        List<List<String>> ans = groupAnagram(strs);
        System.out.println(ans);
    }
}
