//package az.itbrains.codewars;
//
//import java.util.Arrays;
//
//public class ConvertNumberToReversedArrayOfDigits {
//    public static int[] digitize(long n) {
//        String longToString = Long.toString(n);
//        String[] array = new String[longToString.length()];
//        long total = Long.parseLong(longToString);
//        for (int i = 0; i < array.length; i++) {
//            long remainder = total % 10;
//            total /= 10;
//            array[i] = String.valueOf(remainder);
//        }
//        return Integer.parseInt(new int[]array);
//
//    }
//
//    public static void main(String[] args) {
//        long l = 35231;
//        int[] digitize = digitize(l);
//        System.out.println(Arrays.toString(digitize));
//
//    }
//}
