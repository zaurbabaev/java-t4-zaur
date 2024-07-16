package az.edu.itbrains.mentor;

public class FibonachiEx {
    public static void main(String[] args) {
        fibonacci(5);

    }

    public static void fibonacci(int n) {
        int a = 0;
        int b = 1;
        int c;
        for (int i = 0; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
