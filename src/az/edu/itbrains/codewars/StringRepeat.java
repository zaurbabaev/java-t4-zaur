package az.edu.itbrains.codewars;

/*
Write a function that accepts an integer n and a string s
as parameters, and returns a string of s repeated exactly n times.

Examples (input -> output)
6, "I"     -> "IIIIII"
5, "Hello" -> "HelloHelloHelloHelloHello"
 */
public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            result.append(string);
        }
        return result.toString();
    }

    public static String repeatStr2(final int repeat, final String string) {
        return string.repeat(repeat);
    }

    public static void main(String[] args) {
        String string = repeatStr(6, "I");
        System.out.println(string);

        String string2 = repeatStr(5, "Hello");
        System.out.println(string2);
    }
}
