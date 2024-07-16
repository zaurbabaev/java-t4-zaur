package az.edu.itbrains.mentor.test;

import java.util.ArrayList;

public class Test {

    public static void solution(int[] array) {
        ArrayList<Integer> integers = new ArrayList<>();
        int number = array[0];
        int numberCount = 1;


        for (int i = 0; i < array.length; i++) {
            int temp = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    number = array[i];
//                    temp = array[i];
//                    numberCount++;
                    integers.add(number);
                }
            }
//            number = temp;
        }
        System.out.println(integers);
        System.out.println(number + " " + numberCount);

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 5, 6, 5, 9, 6, 5};
        solution(array);
    }
}
