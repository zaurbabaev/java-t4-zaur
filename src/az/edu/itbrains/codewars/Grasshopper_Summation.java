package az.edu.itbrains.codewars;

/*
Write a program that finds the summation of every number from 1 to num.
The number will always be a positive integer greater than 0.
Your function only needs to return the result, what is shown between parentheses in the
example below is how you reach that result and it's not part of it, see the sample tests.
For example (Input -> Output):
2 -> 3 (1 + 2)
8 -> 36 (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8)
 */
public class Grasshopper_Summation {

    public static int summation(int n) {
        int result = 0;
        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result += i;
            }
        }
        return result;
    }

    public static int summation2(int n) {
        if (n == 1) {
            return 1;
        }
        return n + summation2(n - 1);
    }

    public static int summation3(int n) {
        return n * (n + 1) >>> 1;
    }

    public static void main(String[] args) {
        System.out.println(summation3(2));
        System.out.println(summation3(8));
    }
}
