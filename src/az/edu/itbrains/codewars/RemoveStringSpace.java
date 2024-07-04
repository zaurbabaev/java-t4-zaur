package az.edu.itbrains.codewars;

/*
Write a function that removes the spaces from the string,
then return the resultant string.

Examples:

Input -> Output
"8 j 8   mBliB8g  imjB8B8  jl  B" -> "8j8mBliB8gimjB8B8jlB"
"8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd" -> "88Bifk8hB8BB8BBBB888chl8BhBfd"
"8aaaaa dddd r     " -> "8aaaaaddddr"
 */
public class RemoveStringSpace {
    public static String noSpace(final String x) {
        StringBuilder builder = new StringBuilder();
        String[] strings = x.split(" ");
        for (String string : strings) {
            builder.append(string);
        }
        return builder.toString();
    }

    public static String noSpace2(final String x) {
        return x.replace(" ", "");
    }

    public static String noSpace3(final String x) {
        return x.replaceAll("\\s+", "");
    }

    public static String noSpace4(final String x) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) != ' ') {
                builder.append(x.charAt(i));
            }
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String example = "8 j 8   mBliB8g  imjB8B8  jl  B";
        System.out.println(noSpace4(example));
    }

}
