package az.edu.itbrains.lesson4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CastExample {
    public static void main(String[] args) {

        String number = "123";

        int numInteger = Integer.parseInt(number);

        double d = numInteger;

        System.out.println(d);


        int[] a = {1, 2, 3};
        int[] b = {2, 4, 6};
        a = b;
        a = b;
        b[0] = 100;

        Arrays.stream(a).forEach(System.out::println);
        System.out.println();
        Arrays.stream(b).forEach(System.out::println);





    }
}
