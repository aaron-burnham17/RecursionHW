package edu.gcccd.csis;

public class Recursion {
    /*
     * Recursive method to output every other element in the given array backwards,
     * ending with the element at index k.
     * An example input array {1,2,3,4,5,6,7,8,9,10}, called with k=2, should output 9753
     */
    static String printEveryOther(final int[] ia, final int k) {
        if (k < 0||ia == null || k >= ia.length){
            return null;
        }
        if(k >= ia.length-2){
            return String.format("%s",ia[k]);
        }
        else {
            return String.format("%s%s", printEveryOther(ia, k + 2),ia[k]);
        }
    }

    /*
     * Recursively take in a string and place a * between adjacent letters that are the same
     * An example input String "hello" should return hel*lo.
     */
    static String printStars(final String s) {
        if(s.length() <= 1){
            return String.format("%s",s.charAt(0));
        }
        if(s.charAt(0) == s.charAt(1)){
            return s.charAt(0) + "*" + printStars(s.substring(1));
        }
        else{
            return s.charAt(0) + printStars(s.substring(1));
        }
    }

    /*
     * Recursively computes the sum of the 1st k positive numbers.
     * An example input 4 should return 10.
     */
    static int sum(int k) {
        return k > 0 ? k + sum(k - 1) : 0;
    }

    public static void main(String[] args) {
        System.out.println(printEveryOther(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 2));
        System.out.println(printStars("Hellloo"));
        System.out.println(sum(4));
    }
}