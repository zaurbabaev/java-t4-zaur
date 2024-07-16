package az.edu.itbrains.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
You take your son to the forest to see the monkeys.
You know that there are a certain number there (n),
but your son is too young to just appreciate the full number, he has to
start counting them from 1.

As a good parent, you will sit and count with him. Given the number (n),
populate an array with all numbers up to and including that number, but excluding zero.

For example(Input --> Output):
10 --> [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 1 --> [1]
 */
public class CountTheMonkeys {
    public static int[] monkeyCount(final int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int[] monkeyCount2(final int n) {
        return IntStream.rangeClosed(1, n).toArray();
    }

    public static void main(String[] args) {
        int[] ints = monkeyCount2(10);
        System.out.println(Arrays.toString(ints));
    }
}
