package az.edu.itbrains.codewars;

/*
Create a function that takes an integer as an argument and returns
 "Even" for even numbers or "Odd" for odd numbers.
 */
public class EvenOrOdd {
    public static String evenOrOdd(int number) {

        return (number % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        String string = evenOrOdd(12);
        System.out.println(string);
    }

}
