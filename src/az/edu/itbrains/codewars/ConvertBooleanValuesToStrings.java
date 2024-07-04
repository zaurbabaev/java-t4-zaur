package az.edu.itbrains.codewars;

/*
Complete the method that takes a boolean value and return a
"Yes" string for true, or a "No" string for false.
 */
public class ConvertBooleanValuesToStrings {

    public static String boolToWord(boolean b) {
        return b ? "Yes" : "No";
    }

    public static void main(String[] args) {
        String string = boolToWord(true);
        System.out.println(string);
    }

}
