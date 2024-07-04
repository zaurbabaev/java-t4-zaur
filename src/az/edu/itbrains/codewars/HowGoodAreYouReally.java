package az.edu.itbrains.codewars;

import java.util.stream.IntStream;

/*
There was a test in your class and you passed it. Congratulations!

But you're an ambitious person. You want to know if you're better
than the average student in your class.

You receive an array with your peers' test scores. Now calculate
the average and compare your score!

Return true if you're better, else false!

Note:
Your points are not included in the array of your class's points.
Do not forget them when calculating the average score!
 */
public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

        return IntStream.of(classPoints).average().orElse(0) < yourPoints;
    }

    public static boolean betterThanAverage2(int[] classPoints, int yourPoint) {
        int result = 0;
        for (int classPoint : classPoints) {
            result += classPoint;
        }
        int average = result / classPoints.length;
        return yourPoint > average;
    }

    public static void main(String[] args) {
        System.out.println(betterThanAverage2(new int[]{2, 3}, 5));
        System.out.println(betterThanAverage2(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        System.out.println(betterThanAverage2(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        System.out.println(betterThanAverage2(new int[]{100, 90}, 11));
    }
}
