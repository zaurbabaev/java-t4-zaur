package az.edu.itbrains.mentor.exam;

/*
2- verilmish integerin ilk 2 rəqəminin yerini dəyişən method və geriyə int qaytarır
Məs : input -- 435
Output --345
 */
public class ReverseIntegerExample {

    public static int reverseInt(int number) {
        char[] charArray = String.valueOf(number).toCharArray();
        char temp = charArray[0];
        charArray[0] = charArray[1];
        charArray[1] = temp;
        return Integer.parseInt(new String(charArray));
    }

    public static void main(String[] args) {
        int i = reverseInt(435);
        System.out.println(i);
    }
}
