package az.edu.itbrains.codewars;

import java.util.Arrays;

/*
Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is
sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
 */
public class CountOfPositivesSumOfNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        int positivesCount = 0;
        int negativesSum = 0;
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        for (int number : input) {
            if (number > 0) {
                positivesCount++;
            } else {
                negativesSum += number;
            }
        }
        return new int[]{positivesCount, negativesSum};
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(countPositivesSumNegatives(ints)));
    }
}
