package az.edu.itbrains.codewars;

/*
It's pretty straightforward. Your goal is to create a function
that removes the first and last characters of a string.
You're given one parameter, the original string.
You don't have to worry about strings with less than two characters.
 */
public class RemoveFirstAndLastCharacter {
    public static String remove(String str) {
        char[] charArray = str.toCharArray();
        charArray[0] = ' ';
        charArray[charArray.length - 1] = ' ';
        return new String(charArray).trim();
    }

    public static String remove2(String str) {
        StringBuilder builder = new StringBuilder(str);
        builder.deleteCharAt(str.length() - 1);
        builder.deleteCharAt(0);
        return builder.toString();
    }

    public static String remove3(String str) {
        return str.substring(1, str.length()-1);
    }

    public static void main(String[] args) {
        String hello = remove3("Hello");
        System.out.println(hello);
    }
}
