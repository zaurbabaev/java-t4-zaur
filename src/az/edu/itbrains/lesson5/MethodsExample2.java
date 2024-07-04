package az.edu.itbrains.lesson5;

public class MethodsExample2 {

    public static void main(String[] args) {
        String helloJava = findVowel("HelailoJaüvaə");
        System.out.println(helloJava);
        String string = findVowel2("HelailoJaüvaə");
        System.out.println(string);
    }

    //[a], [ı], [o], [u], [e], [ə], [i], [ö], [ü].

    private static String findVowel(String word) {
        StringBuilder result = new StringBuilder();
        char[] toChar = word.toCharArray();
        char[] vowels = {'a', 'ı', 'o', 'u', 'e', 'ə', 'i', 'ö', 'ü'};
        for (char chars : toChar) {
            for (char vowel : vowels) {
                if (chars == vowel) {
                    result.append(chars);
                }
            }
        }
        return result.toString();
    }

    private static String findVowel2(String word) {
        StringBuilder result = new StringBuilder();
        char[] vowels = {'a', 'ı', 'o', 'u', 'e', 'ə', 'i', 'ö', 'ü'};
        for (int i = 0; i < word.length(); i++) {
            char charAt = word.charAt(i);
            for (char vowel : vowels) {
                if (charAt == vowel) {
                    result.append(charAt);
                }
            }
        }
        return result.toString();
    }
}
