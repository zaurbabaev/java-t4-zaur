package az.edu.itbrains.codewars;

/*
Very simple, given a number (integer / decimal / both depending on the language), find its opposite (additive inverse).

Examples:

1: -1
14: -14
-34: 34
 */
public class OppositeNumber {

    public static int opposite(int number) {
        return -number;
    }

    public static int opposite2(int number) {
        return number * -1;
    }

    public static int opposite3(int number) {
        return number > 0 ? -number : Math.abs(number);
    }

}
