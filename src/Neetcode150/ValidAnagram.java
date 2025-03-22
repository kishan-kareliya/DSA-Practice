package Neetcode150;
import java.util.*;
//
//Valid Anagram
//Solved
//Given two strings s and t, return true if the two strings are anagrams of each other,
//otherwise return false.
//An anagram is a string that contains the exact same characters as another string,
//but the order of the characters can be different.
//Example 1:
//Input: s = "racecar", t = "carrace"
//Output: true

public class ValidAnagram {
    public static String sortString(String str){
        char[] characters = new char[str.length()];
        characters = str.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }
    public static boolean checkAnagram(String s,String t){
        return sortString(s).equals(sortString(t));
    }
    public static void main(String args[]){
        System.out.println(checkAnagram("racecar","carrace"));
    }
}
