package az.edu.itbrains.codewars;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
Find Mean
Find the mean (average) of a list of numbers in an array.

Information
To find the mean (average) of a set of numbers add all of the numbers together and divide by the number of values in the list.

For an example list of 1, 3, 5, 7

1. Add all of the numbers

1+3+5+7 = 16
2. Divide by the number of values in the list. In this example there are 4 numbers in the list.

16/4 = 4
3. The mean (or average) of this list is 4
 */
public class Grasshopper_ArrayMean {
    public static int findAverage(int[] nums) {
        int average = 0;
        for (int num : nums) {
            average += num;
        }
        return average / nums.length;
    }

    public static int findAverage2(int[] nums) {
       return (int) Arrays.stream(nums).average().orElse(0);
    }

    public static int findAverage3(int[] nums) {
        return Arrays.stream(nums).sum()/nums.length;
    }

    public static void main(String[] args) {
        int average = findAverage3(new int[]{1, 3, 5, 7});
        System.out.println(average);
    }
}
