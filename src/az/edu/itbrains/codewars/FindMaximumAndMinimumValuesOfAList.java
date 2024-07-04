package az.edu.itbrains.codewars;

/*
Your task is to make two functions ( max and min, or maximum and minimum, etc., depending on the language ) that receive a list of integers as input, and return the largest and lowest number in that list, respectively.

Examples (Input -> Output)
* [4,6,2,1,9,63,-134,566]         -> max = 566, min = -134
* [-52, 56, 30, 29, -54, 0, -110] -> min = -110, max = 56
* [42, 54, 65, 87, 0]             -> min = 0, max = 87
* [5]                             -> min = 5, max = 5
 */
public class FindMaximumAndMinimumValuesOfAList {
    public static int min(int[] list) {
        int minimum = Integer.MAX_VALUE;
        for (int number : list) {
            if (minimum > number) {
                minimum = number;
            }
        }
        return minimum;
    }

    public static int max(int[] list) {
        int maximum = Integer.MIN_VALUE;
        for (int number : list) {
            if (maximum < number) {
                maximum = number;
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int[] ints = {4, 6, 2, 1, 9, 63, -134, 566};
        System.out.println(min(ints));
        System.out.println(max(ints));

    }
}
