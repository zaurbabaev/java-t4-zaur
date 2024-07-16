package az.edu.itbrains.mentor.exam;

public class Test {
    public static void main(String[] args) {
        byte b = 50;
        print((short) b);
    }
    private static void print(Short num) {
        System.out.println(num++);
    }
}
