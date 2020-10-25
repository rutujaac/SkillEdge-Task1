import java.util.*;

class Solution_8 {
    public static void main(String args[]) {
        System.out.println(convertString("success"));
    }

    static String convertString(String str) {
        //If string is empty, return it
        if(str.length()==0)
            return str;
        HashMap<Character,Integer> char_map = new HashMap<>();
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        //Storing the count of occurrences of each character in the string
        for(int i=0;i<str.length();i++) {
            if(char_map.containsKey(str.charAt(i))) {
                int v = char_map.get(str.charAt(i));
                char_map.put(str.charAt(i),v+1);
            }
            else {
                char_map.put(str.charAt(i),1);
            }
        }

        //Creating new string based on the occurrence count
        for(int i=0;i<str.length();i++) {
            if(char_map.get(str.charAt(i))>1){
                sb.append(')');
            }
            else {
                sb.append('(');
            }
        }
        return sb.toString();

    }
}