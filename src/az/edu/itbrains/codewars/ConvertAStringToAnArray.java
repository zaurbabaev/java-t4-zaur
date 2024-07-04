package az.edu.itbrains.codewars;

import java.util.Arrays;

/*
Write a function to split a string and convert it into an array of words.

Examples (Input ==> Output):
"Robin Singh" ==> ["Robin", "Singh"]

"I love arrays they are my favorite" ==> ["I", "love", "arrays", "they", "are", "my", "favorite"]
 */
public class ConvertAStringToAnArray {
    public static String[] stringToArray(String s) {
        String[] strings = s.split(" ");
        String[] result = new String[strings.length];
        System.arraycopy(strings, 0, result, 0, result.length);
        return result;
    }

    public static String[] stringToArray2(String s) {
        return s.split(" ");
    }

    public static void main(String[] args) {
        String s1 = "Robin Singh";
        String s2 = "I love arrays they are my favorite";
        System.out.println(Arrays.toString(stringToArray2(s1)));
        System.out.println(Arrays.toString(stringToArray2(s2)));
    }
}
