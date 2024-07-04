package az.edu.itbrains.lesson5;

public class RecursiveExample {

    public static void main(String[] args) {
        int number=10;
        recurse(number);
        System.out.println();
        recurse2(number);
    }
    public static void recurse(int i) {
        if (i > 0) {
            recurse(i-1);
        }
        System.out.print(i+" ");

    }

    public static void recurse2(int i) {
        System.out.print(i+" ");
        if (i > 0) {
            recurse2(i-1);
        }
    }


}
