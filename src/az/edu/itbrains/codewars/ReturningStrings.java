package az.edu.itbrains.codewars;

/*
Make a function that will return a greeting statement that uses an input; your program should return,
"Hello, <name> how are you doing today?".

[Make sure you type the exact thing I wrote or the program may not execute properly]
 */
public class ReturningStrings {

    public static String greet(String name) {
        return String.format("Hello, %s how are you doing today?",name);
    }

    public static String greet2(String name) {
        return "Hello, %s how are you doing today?".formatted(name);
    }

    public static void main(String[] args) {
        String kata = greet2("Kata");
        System.out.println(kata);
    }
}
