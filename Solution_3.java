import java.util.*;

class Solution_3 {
    public static void main(String args[]) {
        findDivisors(25);
    }

    static ArrayList<Integer> isPrime(int num) {
        //Arraylist to store the divisors if number is not prime
        ArrayList<Integer> divisors = new ArrayList<Integer>();
        for(int i=2;i<=num/2;i++) {
            if(num%i == 0) {
                divisors.add(i);
            }
        }
        //Return the list of divisors
        return divisors;
    }

    public static void findDivisors(int num) {
       ArrayList<Integer> div = isPrime(num);
       //If number is prime then print number is prime
       if(div.size()==0) {
           System.out.println(num+ " is Prime");
       }
       //If number is not prime then print the list of divisors
       else {
           System.out.println(div);
       }
    }
}