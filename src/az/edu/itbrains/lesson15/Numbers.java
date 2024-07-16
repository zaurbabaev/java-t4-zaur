package az.edu.itbrains.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {

        int[] numbers = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

//         int massivini Listə yerləşdirmək üçün massivi İntegerə çevirmək lazımdır.
//        List<Integer> list = new ArrayList<>(Arrays.asList(numbers));
//
//        List<Integer> list2 = Arrays.stream(numbers).toList();

        List<Integer> integers = new ArrayList<>();


        for (int j = 1; j < numbers.length; j++) {
            int k = 0;
            for (int i = 1; i < j + 1; i++) {
                if (j % i == 0) {
                    k++;
                }
            }
            if (k == 2) {
                integers.add(j);
            }
        }
        System.out.println(integers);
    }
}
