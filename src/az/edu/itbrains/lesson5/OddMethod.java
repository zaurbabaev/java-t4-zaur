package az.edu.itbrains.lesson5;

public class OddMethod {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 5, 6, 7, 8, 9, 12, 13, 15};

        int sum = sum(array);
        System.out.println(sum);

        int i1 = numbersAverage(array);
        System.out.println(i1);
    }


    private static int numbersAverage(int[] array) {
        return sum(array) / array.length;
    }

    private static int sum(int[] array) {
        int result = 0;
        for (int number : array) {
            if (number % 2 != 0) {
                result += number;
            }
        }
        return result;
    }


}
