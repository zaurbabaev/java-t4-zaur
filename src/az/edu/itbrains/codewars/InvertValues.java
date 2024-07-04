package az.edu.itbrains.codewars;

import java.util.Arrays;

/*
Given a set of numbers, return the additive inverse of each.
Each positive becomes negatives, and the negatives become positives.

[1, 2, 3, 4, 5] --> [-1, -2, -3, -4, -5]
[1, -2, 3, -4, 5] --> [-1, 2, -3, 4, -5]
[] --> []
 */
public class InvertValues {
    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(x -> -x ).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(invert(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(invert(new int[]{1, -2, 3, -4, 5})));
    }
}
