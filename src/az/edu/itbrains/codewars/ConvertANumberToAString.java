package az.edu.itbrains.codewars;

/*
We need a function that can transform a number (integer) into a string.

What ways of achieving this do you know?

Examples (input --> output):
123  --> "123"
999  --> "999"
-100 --> "-100"
 */
public class ConvertANumberToAString {

    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        String string = numberToString(123);
        System.out.println(string);
    }
}
