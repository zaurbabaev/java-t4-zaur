package az.edu.itbrains.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Create a function with two arguments that will return an array of the first n multiples of x.

Assume both the given number and the number of times to count will be positive numbers greater than 0.

Return the results as an array or list ( depending on language ).

Examples
countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}
countBy(2,5)  // should return {2,4,6,8,10}
 */
public class CountByX {

    public static int[] countBy(int x, int n) {
        int[] ints = new int[n];
        int index = 0;
        while (index != n) {
            ints[index] = x * ++index;
        }
        return ints;
    }

    public static int[] countBy2(int x, int n) {
        int[] ints = new int[n];
        for (int i = 0; i < n; i++) {
            ints[i] = x * (i + 1);
        }
        return ints;
    }

    public static int[] countBy3(int x, int n) {
        return IntStream.iterate(x, it -> it + x)
                .limit(n).toArray();
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy3(1, 10)));
        System.out.println(Arrays.toString(countBy3(2, 5)));
    }
}
