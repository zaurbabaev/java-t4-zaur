package az.edu.itbrains.codewars;

import java.util.ArrayList;
import java.util.Arrays;

/*
Take an array and remove every second element from the array.
Always keep the first element and start removing with the next element.

Example:
["Keep", "Remove", "Keep", "Remove", "Keep", ...] --> ["Keep", "Keep", "Keep", ...]

None of the arrays will be empty, so you don't have to worry about that!
 */
public class RemovingElements {

    public static Object[] removeEveryOther(Object[] arr) {
        ArrayList<Object> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                list.add(arr[i]);
            }
        }
        return list.toArray();
    }

    public static void main(String[] args) {
        Object[] objects = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Object[] objects1 = removeEveryOther(objects);
        System.out.println(Arrays.toString(objects1));
    }
}
