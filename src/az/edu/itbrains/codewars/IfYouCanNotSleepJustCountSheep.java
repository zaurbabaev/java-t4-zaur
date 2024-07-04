package az.edu.itbrains.codewars;

/*
If you can't sleep, just count sheep!!

Task:
Given a non-negative integer, 3 for example, return a string with a murmur:
"1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
 */
public class IfYouCanNotSleepJustCountSheep {
    public static String countingSheep(int num) {
        String result = "";
        for (int i = 1; i <= num; i++) {
            result += i + " sheep...";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(3));
    }
}