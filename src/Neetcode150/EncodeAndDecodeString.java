package Neetcode150;
import java.util.*;

public class EncodeAndDecodeString {

    public static String encoding(List<String> strs){
        String encodedStr = "";
        for(String str : strs){
            encodedStr += str.length() + "#" + str;
        }
        return encodedStr;
    }

    public static List<String> decoding(String str){
        List<String> ans = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            i = j+1;
            j = length+i;
            ans.add(str.substring(i,j));
            i = j;
        }
        return ans;
    }

    public static void main(String args[]){
        List<String> names = new ArrayList<>(Arrays.asList("kishan","rahul","vraj","ghanshyam"));

        String encodedString = encoding(names);
        System.out.println(encodedString);

        List<String> decodedString = decoding(encodedString);
        System.out.println(decodedString);
    }
}
