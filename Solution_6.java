import java.util.*;

class Solution_6 {
    public static void main(String args[]) {
        System.out.println(longestAlphabeticalSubstring("aaaacdfthnmoiuytdsdfgh"));
    }

    static String longestAlphabeticalSubstring(String str) {
        int prev = 0;
        int next = 1;
        int max_length = 0;
        int start=0,end=0;

        //If string consists of only one character, return it
        if(str.length()==1)
            return str;
        
        while(next<str.length()) {
            //Check if the next character is in alphabetical order
            if(next<str.length() && str.charAt(next-1) <= str.charAt(next)) {
                next = next+1;
            }
            //If not, re-assign values to prev and next pointers
            else {
                if(max_length < (next-prev+1)) {
                    max_length = (next-prev+1);
                    start = prev;
                    end = next;
                }
                prev = next;
                next = next+1;
            }
        }
        //Return the longest substring in alphabetical order
        return str.substring(start,end);
    }
}