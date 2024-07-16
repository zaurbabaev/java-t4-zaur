package az.edu.itbrains.codewars;

import java.util.Arrays;

/*
Convert number to reversed array of digits
Given a random non-negative number, you have to return
the digits of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]
 */
public class ConvertNumberToReversedArrayOfDigits {
    public static int[] digitize(long n) {
        String numberForString = String.valueOf(n);
        int size = numberForString.length();
        int[] array = new int[size];
        long total = n;
        long remainder = 0;
        for (int i = 0; i < size; i++) {
            remainder = total % 10;
            total /= 10;
            array[i] = (int) remainder;
        }
        return array;

    }

    public static int[] digitize2(long n) {
        return new StringBuilder().append(n)
                .reverse()
                .chars()
                .map(Character::getNumericValue)
                .toArray();

    }


    public static void main(String[] args) {
        long l = 35231;
        int[] digitize = digitize2(l);
        System.out.println(Arrays.toString(digitize));

    }
}
