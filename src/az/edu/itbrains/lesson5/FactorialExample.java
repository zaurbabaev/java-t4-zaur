package az.edu.itbrains.lesson5;

public class FactorialExample {

    public static void main(String[] args) {
        int number=5;
        int factorial = factorial(number);
        System.out.println("factorial = " + factorial);
        int factorial2 = factorial2(number);
        System.out.println("factorial2 = " + factorial2);
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorial2(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
