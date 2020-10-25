import java.util.*;

class Solution_4 {
    public static void main(String args[]) {
        System.out.println(convertIntoCamelCase("camel case word"));
    }

    static String convertIntoCamelCase(String str) {
        //Split the original string to access each word from the string
        String[] splited_arr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s: splited_arr) {
            //Capitalize the first letter of each string in the string array
            String new_str = s.substring(0,1).toUpperCase() + s.substring(1);
            sb.append(new_str);
        }
        //Return a single string from the string builder object
        return sb.toString();
    }
}