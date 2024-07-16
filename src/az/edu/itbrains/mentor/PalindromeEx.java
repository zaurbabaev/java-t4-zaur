package az.edu.itbrains.mentor;

public class PalindromeEx {
    public static void main(String[] args) {
        boolean palindrome = isPalindrome(123321);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(int number) { //363
        int givenNumber = number;
        int remainder = 0;
        int result = 0;
        while (givenNumber != 0) {
            remainder = givenNumber % 10;
            result = result * 10 + remainder;
            givenNumber = givenNumber / 10;

        }
        return result == number;
    }

}
