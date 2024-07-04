package az.edu.itbrains.codewars;

import java.util.Arrays;

/*
Complete the square sum function so that it squares each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because
 */
public class SquareNSum {
    public static int squareSum(int[] n) {
        int result = 0;
        for (int number : n) {
            result += number * number;
        }
        return result;
    }

    public static int squareSum2(int[] n) {
        return Arrays.stream(n).map(x -> x * x).sum();
    }

    public static int squareSum3(int[] n) {
        int result = 0;
        for (int num : n) {
            result += (int) Math.pow(num, 2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2};
        int squaredSum = squareSum3(array);
        System.out.println(squaredSum);
    }
}
