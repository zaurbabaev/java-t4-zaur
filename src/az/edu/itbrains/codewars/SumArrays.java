package az.edu.itbrains.codewars;

import java.util.Arrays;

/*
Write a function that takes an array of numbers and returns
the sum of the numbers. The numbers can be negative or non-integer.
If the array does not contain any numbers then you should return 0.

Examples
Input: [1, 5.2, 4, 0, -1]
Output: 9.2

Input: []
Output: 0

Input: [-2.398]
Output: -2.398
 */
public class SumArrays {

    public static double sum(double[] numbers) {
        double result = 0;
        if (numbers.length == 0) {
            return 0.0;
        }
        for (double number : numbers) {
            result += number;
        }
        return result;
    }

    public static double sum2(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }



    public static void main(String[] args) {
        double[] array1 = {1, 5.2, 4, 0, -1};
        double sum = sum2(array1);
        System.out.println(sum);
        double[] array2 = {};
        System.out.println(sum2(array2));

    }
}
