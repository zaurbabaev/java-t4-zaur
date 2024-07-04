package az.edu.itbrains.codewars;

/*
Your classmates asked you to copy some paperwork for them.
You know that there are 'n' classmates and the paperwork has 'm' pages.

Your task is to calculate how many blank pages do you need.
If n < 0 or m < 0 return 0.

Example:
n= 5, m=5: 25
n=-5, m=5:  0
 */
public class BeginnerSeries {
    public static int paperWork(int n, int m) {
        ;
        return (n < 0 || m < 0) ? 0 : n * m;
    }

    public static void main(String[] args) {
        System.out.println(paperWork(5, 5));
        System.out.println(paperWork(-5, 5));

    }
}
