package az.edu.itbrains.codewars;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Write a function that takes an array of words and smashes them
together into a sentence and returns the sentence. You can ignore
any need to sanitize words or add punctuation, but you should
add spaces between each word. Be careful, there shouldn't be a
space at the beginning or the end of the sentence!
 */
public class SentenceSmash {
    public static String smash(String... words) {
        return String.join(" ", words);
    }

    public static String smash2(String... words) {
        StringBuilder builder = new StringBuilder();
        for (String word : words) {
            String[] strings = word.split(" ");
            for (String string : strings) {

                builder.append(string).append(" ");
            }

        }
        return builder.toString().trim();
    }

    public static String smash3(String... words) {
        return Stream.of(words).collect(Collectors.joining(" "));
    }


    public static void main(String[] args) {
        System.out.println(smash3(new String[]{"hello", "world"}));
        System.out.println(smash3(new String[]{"hello"}));
    }
}
