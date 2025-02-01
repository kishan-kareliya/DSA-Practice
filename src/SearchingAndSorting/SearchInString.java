package SearchingAndSorting;

public class SearchInString {
    public static void main(String[] args) {
        String name = "kishan";
        char target = 'n';

        System.out.println(SearchCharacterAt(name,target));
    }
    public static int SearchCharacterAt(String str,char target){
        if(str.isEmpty()){
            return -1;
        }
        for(int i=0;i<str.length();i++){
            if(target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
}
