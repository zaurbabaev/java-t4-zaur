package az.edu.itbrains.codewars;

/*
Your task is to create a function that does four basic
mathematical operations.

The function should take three arguments - operation(string/char),
value1(number), value2(number).
The function should return result of numbers after applying the
chosen operation.

Examples(Operator, value1, value2) --> output
('+', 4, 7) --> 11
('-', 15, 18) --> -3
('*', 5, 5) --> 25
('/', 49, 7) --> 7
 */
public class BasicMathematicalOperations {

    public static Integer basicMath(String op, int v1, int v2) {
        return switch (op) {
            case "+" -> v1 + v2;
            case "-" -> v1 - v2;
            case "*" -> v1 * v2;
            case "/" -> v1 / v2;
            default -> throw new IllegalStateException("Unexpected value: " + op);
        };
    }

    public static void main(String[] args) {
        System.out.println(basicMath("+", 4, 7));
        System.out.println(basicMath("-", 15, 18));
        System.out.println(basicMath("*", 5, 5));
        System.out.println(basicMath("/", 49, 7));
    }
}
