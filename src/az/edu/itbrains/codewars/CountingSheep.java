package az.edu.itbrains.codewars;

/*
Consider an array/list of sheep where some sheep may be missing
from their place. We need a function that counts the number of
sheep present in the array (true means present).
 */
public class CountingSheep {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        for (Boolean sheep : arrayOfSheeps) {
            if (sheep != null && sheep) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Boolean[] array1 = {true, true, true, false,
                true, true, true, true,
                true, false, true, false,
                true, false, false, true,
                true, true, true, true,
                false, false, true, true};
        CountingSheep countingSheep = new CountingSheep();
        int countSheeps = countingSheep.countSheeps(array1);
        System.out.println(countSheeps);
    }
}
