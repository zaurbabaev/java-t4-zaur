package az.edu.itbrains.codewars;

/*
Write function RemoveExclamationMarks which removes all exclamation marks from a given string.
 */
public class RemoveExclamationMarks {
    static String removeExclamationMarks(String s) {
        String[] strings = s.split("!");
        StringBuilder builder = new StringBuilder();
        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    static String removeExclamationMarks2(String s) {
        return s.replaceAll("!","");
    }





    public static void main(String[] args) {
        String string = removeExclamationMarks2("Hello World!!");
        System.out.println(string);
    }
}
