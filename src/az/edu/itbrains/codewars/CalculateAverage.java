package az.edu.itbrains.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Write a function which calculates the average of the numbers
in a given list.
 */
public class CalculateAverage {
    public static double find_average(int[] array) {
        int result = 0;
        for (int number : array) {
            result += number;
        }
        return (double) result / array.length;
    }

    public static double find_average2(int[] array) {
//        return Arrays.stream(array).average().orElse(0);
        return IntStream.of(array).average().getAsDouble();

    }

    public static void main(String[] args) {
        System.out.println(find_average2(new int[]{1, 2, 3}));
    }
}
