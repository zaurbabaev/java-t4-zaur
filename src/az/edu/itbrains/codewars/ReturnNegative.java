package az.edu.itbrains.codewars;

/*
In this simple assignment you are given a number and have to make it negative. But maybe the number is already negative?

Examples
Kata.makeNegative(1);  // return -1
Kata.makeNegative(-5); // return -5
Kata.makeNegative(0);  // return 0
 */
public class ReturnNegative {

    public static int makeNegative(final int x) {
        return x > 0 ? -x : x;
    }

    public static int makeNegative2(final int x) {
        return -Math.abs(x);
    }

    public static void main(String[] args) {
        int i = makeNegative2(1);
        System.out.println(i);
        int i1 = makeNegative2(5);
        System.out.println(i1);
        int i2 = makeNegative2(0);
        System.out.println(i2);
    }
}
