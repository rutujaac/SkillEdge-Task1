class Solution_7 {
    public static void main(String args[]) {
        System.out.println(convertToMixed(42,9));
    }

    static int hcf(int num1,int num2) {
        int hcf = 0;
        
        //Finding the HCF of given numbers
        for(int i=1;i<=num1 || i<=num2;i++) {
            if( num1%i == 0 && num2%i == 0 )
            hcf = i;
         }
         return hcf;
    }

    static String convertToMixed(int numerator, int denominator) {
        String mixedNum = "";
        //Find the whole part of the mixed fraction
        int wholePart = Math.floorDiv(numerator,denominator);
        if(numerator%denominator != 0) {
            //Find the HCF of the remaining fraction's numerator and denominator
            int hcf = hcf((numerator - wholePart*denominator),denominator);
            //Construct the mixed fraction from the whole part and the hcf
            mixedNum = wholePart + " " + ((numerator - wholePart*denominator)/hcf) + "/" + denominator/hcf;
        }
        else {
            mixedNum = wholePart + " ";
        }
        
        return mixedNum;
    }
}