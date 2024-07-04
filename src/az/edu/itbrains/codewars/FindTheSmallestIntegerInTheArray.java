package az.edu.itbrains.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
public class FindTheSmallestIntegerInTheArray {

    public static int findSmallestInt(int[] args) {
        if (args.length != 0) {
            Arrays.sort(args);

        }
        return args[0];

    }

    public static int findSmallestInt2(int[] args) {
         return Arrays.stream(args).min().orElseThrow();
    }

    public static int findSmallestInt3(int[] args) {
        return IntStream.of(args).min().orElseThrow();
    }




    public static void main(String[] args) {
        int[] ints = {34, 15, 88, 2};
        System.out.println(findSmallestInt2(ints));
        int[] ints2 = {34, -345, -1, 100};
        System.out.println(findSmallestInt2(ints2));
    }
}
