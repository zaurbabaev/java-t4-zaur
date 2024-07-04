package az.edu.itbrains.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Given an array of integers, return a new array with each
value doubled.

For example:

[1, 2, 3] --> [2, 4, 6]
 */
public class BeginnerLostWithoutAMap {

    public static int[] map(int[] arr) {

        return Arrays.stream(arr).map(x -> x * 2).toArray();
    }

    public static int[] map2(int[] arr) {

        return IntStream.of(arr).map(x -> x * 2).toArray();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] map = map2(array);
        System.out.println(Arrays.toString(map));
    }
}
