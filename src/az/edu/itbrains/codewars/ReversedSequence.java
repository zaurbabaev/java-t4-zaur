package az.edu.itbrains.codewars;

import java.util.Arrays;

/*
Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
 */
public class ReversedSequence {

    public static int[] reverse(int n) {
        int[] ints = new int[n];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = n-i;
        }
        return ints;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(10)));
    }

}
