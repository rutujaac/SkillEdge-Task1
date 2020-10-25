
class Solution_2 {
    public static void main(String args[]) {
        System.out.println(stringConversion("cOdE"));
    }

    //Function to convert string into required form
    static String stringConversion(String str) {
        int caps=0, lows=0;

        //return nothing if string is empty
        if(str.length()==0)
            return "";

        // Check the count of lowercase and uppercase characters in the string
        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)>=65 && str.charAt(i)<=90) {
                caps++;
            }
            else if(str.charAt(i)>=97 && str.charAt(i)<=122) {
                lows++;
            }
        }

        //Compare both counts
        if(lows>=caps) {
            return str.toLowerCase();
        }
        return str.toUpperCase();
    }
}