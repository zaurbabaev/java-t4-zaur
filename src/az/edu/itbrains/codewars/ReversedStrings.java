package az.edu.itbrains.codewars;

/*
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
'word'   =>  'drow'
 */
public class ReversedStrings {
    public static String solution(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char lastSymbol = str.charAt(str.length() - i - 1);
            builder.append(lastSymbol);
        }
        return builder.toString();
    }

    public static String solution2(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static String solution3(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length(); i > 0; i--) {
            builder.append(str.charAt(i - 1));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String world = solution3("world");
        System.out.println(world);
        String word = solution3("word");
        System.out.println(word);
    }
}
