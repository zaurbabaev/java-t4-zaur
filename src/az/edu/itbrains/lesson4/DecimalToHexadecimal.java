package az.edu.itbrains.lesson4;

public class DecimalToHexadecimal {
    public static void main(String[] args) {


        int[] rgb = {230, 126, 34}; // e67e22

        String[] hexArray = {"a", "b", "c", "d", "e", "f"};
        StringBuilder result = new StringBuilder();

        for (int number : rgb) {
            int integer = number / 16;
            int remainder = number % 16;
            int integerIndex = integer - 10;
            int remainderIndex = remainder - 10;

            if (integerIndex >= 0) {
                result.append(hexArray[integerIndex]);
            } else {
                result.append(integer);
            }
            if (remainderIndex >= 0) {
                result.append(hexArray[remainderIndex]);
            } else {
                result.append(remainder);
            }
        }

        System.out.println(result);

        for (int i : rgb) {

            String hexString = Integer.toHexString(i);
            System.out.print(hexString);
        }


    }
}
