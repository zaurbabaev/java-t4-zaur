package az.edu.itbrains.codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of integers as strings and numbers, return the sum of the array
values as if all were numbers.

Return your answer as a number.
 */
public class SumMixedArray {

    public static int sum(List<?> mixed) {
        int result = 0;
        for (Object object : mixed) {
            if (object instanceof Integer integer) {
                result += integer;
            }
            if (object instanceof String string) {
                result += Integer.parseInt(string);
            }
        }
        return result;
    }

    public static int sum2(List<?> mixed) {
        return mixed.stream().mapToInt(o -> Integer.parseInt(o.toString())).sum();
    }

    public static int sum3(List<?> mixed) {
        int result = 0;
        for (Object object : mixed) {
            result += Integer.parseInt(object.toString());
        }
        return result;
    }

    public static int sum4(List<?> mixed) {
        return mixed.stream()
                .map(Object::toString)
                .mapToInt(Integer::parseInt)
                .sum();
    }

    public static void main(String[] args) {
        List arrayList = new ArrayList<>(Arrays.asList(9, 3, "7", "3"));
        int sum = sum4(arrayList);
        System.out.println(sum);
    }

}
