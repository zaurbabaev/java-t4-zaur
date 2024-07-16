package az.edu.itbrains.mentor.exam;

import java.util.Arrays;

/*
1- Daxil edilmish stringde tək indexde dayanan sözləri  tərsinə çevirib,
orginal sözlə  dəyişib yenidən string formatta qaytaran methot.
Məs : input-- hey Salam necəsən sen
Output -- hey malas necəsən nes
 */
public class StringExample {

    public static String findAndReverse(String word) {
        String[] strings = word.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if (i % 2 != 0) {
                strings[i] = reverseString3(strings[i]);
            }
        }
        return Arrays.toString(strings);
    }

    public static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        char temp;
        for (int i = 0; i < charArray.length / 2; i++) {
            temp = charArray[i];
            charArray[i] = charArray[charArray.length - i - 1];
            charArray[charArray.length - i - 1] = temp;
        }
        return new String(charArray);
    }


//    StringBuilerin reverse metodu
//    public static String reverseString2(String s) {
//        return new StringBuilder(s).reverse().toString();
//    }

    public static String reverseString3(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(s.length() - i - 1));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String strings = findAndReverse("hey Salam necəsən sen");
        System.out.println(strings);
    }
}
