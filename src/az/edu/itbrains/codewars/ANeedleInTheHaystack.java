package az.edu.itbrains.codewars;

import java.util.Arrays;

public class ANeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] instanceof String string) {
                if(string.equals("needle"))
                return "found the needle at position " + i;
            }
        }
        return "Not found";

    }

    public static String findNeedle2(Object[] haystack) {
     return "found the needle at position "+ Arrays.asList(haystack).indexOf("needle");

    }

    public static void main(String[] args) {
        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
        Object[] haystack2 = {"283497238987234", "a dog", "a cat", "some random junk", "a piece of hay", "needle", "something somebody lost a while ago"};
        Object[] haystack3 = {1,2,3,4,5,6,7,8,8,7,5,4,3,4,5,6,67,5,5,3,3,4,2,34,234,23,4,234,324,324,"needle",1,2,3,4,5,5,6,5,4,32,3,45,54};
        System.out.println(findNeedle2(haystack1));
        System.out.println(findNeedle2(haystack2));
        System.out.println(findNeedle2(haystack3));
    }
}
