package az.edu.itbrains.lesson5;

public class MethodsExample {
    public static void main(String[] args) {
        String word = "Salam";
        reverseString(word);
        System.out.println();
        reverseString2(word);
    }

    private static void reverseString2(String word) {
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }
    }

    private static void reverseString(String word) {
        for (int i = 0; i < word.length(); i++) {
            int lastIndex = word.length() - 1 - i;
            char c = word.charAt(lastIndex);
            System.out.print(c);
        }
    }
}
