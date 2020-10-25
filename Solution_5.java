import java.util.*;

class Solution_5 {
    public static void main(String args[]) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(sumArray(arr));
    }

    static ArrayList<Integer> sumArray(int arr[]) {
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        //Calculating the sum of all the elements in the array
        for(int i=0;i<arr.length;i++)
            sum += arr[i];
        
        /* Add the sum into the result list and then subtract each element from the sum */
        for(int i=0;i<arr.length;i++) {
            result.add(sum);
            sum = sum-arr[i];
        }
        //Add last sum value
        result.add(sum);

        //Return the result list
        return result;
    }
}