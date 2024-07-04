package az.edu.itbrains.lesson6;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int opposite = opposite(-5);
        System.out.println(opposite);
        int[] ints = {-1, -2, -3, -4, -5};
        System.out.println(Arrays.toString(ints));
        int[] invert = invert3(ints);
        System.out.println(Arrays.toString(invert));


    }

    public static int opposite(int number) {
//        return number > 0 ? -number : Math.abs(number);
        return -number;
    }

    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = -array[i];
        }
        return array;
    }

    public static int[] invert2(int[] array) {
        return Arrays.stream(array).map(i -> -i).toArray();
    }

    public static int[] invert3(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= -1;
        }
        return array;
    }
}
