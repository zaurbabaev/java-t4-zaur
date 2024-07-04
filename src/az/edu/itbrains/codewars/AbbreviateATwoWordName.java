package az.edu.itbrains.codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
Write a function to convert a name into initials.
This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F
 */
public class AbbreviateATwoWordName {
    public static String abbrevName(String name) {
        StringBuilder builder = new StringBuilder();
        char[] charArray = name.toUpperCase().toCharArray();
        builder.append(charArray[0]).append(".");
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == ' ') {
                builder.append(charArray[i + 1]);
            }
        }
        return builder.toString();
    }

    public static String abbrevName2(String name) {
        String upperName = name.toUpperCase();
        String[] strings = upperName.split(" ");
        return strings[0].charAt(0) + "." + strings[1].charAt(0);
    }

    public static String abbrevName3(String name) {
        return (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();
    }

    public static String abbrevName4(String name) {
        return Arrays.stream(name.split(" "))
                .map(String::toUpperCase)
                .map(m -> m.substring(0, 1))
                .collect(Collectors.joining("."));
    }

    public static void main(String[] args) {
        System.out.println(abbrevName4("Sam Harris"));
        System.out.println(abbrevName4("patrick feeney"));
    }
}
