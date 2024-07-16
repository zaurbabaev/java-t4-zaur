package az.edu.itbrains.codewars;

import static java.util.stream.Collectors.joining;

/*
Given a string of digits, you should replace any digit below
5 with '0' and any digit 5 and above with '1'.
Return the resulting string.

Note: input will never be an empty string
 */
public class FakeBinary {
    // böyük rəqəmlərlə işləmir
    public static String fakeBin(String numberString) {
        long total = Long.parseLong(numberString);
        long remainder = 0;
        StringBuilder fakeBinary = new StringBuilder();
        while (total != 0) {
            remainder = total % 10;
            if (remainder >= 5) {
                fakeBinary.append(1);
            } else {
                fakeBinary.append(0);
            }
            total /= 10;
        }
        return fakeBinary.reverse().toString();
    }

    public static String fakeBin2(String numberString) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
//            char[] charArray = numberString.toCharArray();
            char charAt = numberString.charAt(numberString.length() - 1 - i);
            builder.append(charAt >= '5' ? 1 : 0);
        }
        return builder.reverse().toString();
    }

    public static String fakeBin3(String numberString) {
        return numberString.replaceAll("[0-4]", "0")
                .replaceAll("[5-9]", "1");
    }

    public static String fakeBinary(String numberString) {
        char[] charArray = numberString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = charArray[i] < '5' ? '0' : '1';
        }
        return new String(charArray);
    }

    public static String fakeBin4(String numberString) {
        return numberString.chars().mapToObj(c -> c < '5' ? "0" : "1").collect(joining());
    }


    public static void main(String[] args) {
        String string = fakeBin4("45385593107843568");
        System.out.println(string);
    }

    //01011110001100111
}
