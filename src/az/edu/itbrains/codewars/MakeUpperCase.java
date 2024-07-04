package az.edu.itbrains.codewars;

/*
Write a function which converts the input string to uppercase.
 */
public class MakeUpperCase {

    public static String makeUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(makeUpperCase("hello"));
    }
}
