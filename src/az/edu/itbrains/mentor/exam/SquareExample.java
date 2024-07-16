package az.edu.itbrains.mentor.exam;

/*
4- verilmish ədədi ən yaxın kvadratı olan ədədi tapan method
Input -- 114
Output -- 11
 */
public class SquareExample {
    public static int squareEx(int number){
        double sqrt = Math.sqrt(number);
        return (int) Math.round(sqrt);
//        return (int) Math.ceil(sqrt);
    }

    public static void main(String[] args) {
        int i = squareEx(114);
        System.out.println(i);
    }
}
