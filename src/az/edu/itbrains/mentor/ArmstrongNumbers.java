package az.edu.itbrains.mentor;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        boolean armStrong2 = isArmStrong2(1634);
        System.out.println(armStrong2);


    }

    private static void armstrongNumbersLength3() {
        int number = 153;
        int result = 0;
        int total = number;
        int armstrong = 0;
        while (total != 0) {
            int remainder = total % 10;
            result = remainder * remainder * remainder;
            armstrong += result;
            total /= 10;
        }
        System.out.println(armstrong);
    }

    public static boolean isArmStrong(int number,int count){
        int sum=0;
        int digit=0;
        int givenNumber=number;
        while(number!=0){
            digit=number%10;
            sum+=Math.pow(digit,count);
            number=number/10;
        }
        return sum==givenNumber;
    }

    public static int count(int number){
        int count=0;
        while(number!=0){
            count++;
            number=number/10;
        }
        return count;
    }

    public static boolean isArmStrong2(int number){
        int numberLength = String.valueOf(number).length();
        int sum=0;
        int digit=0;
        int givenNumber=number;
        while(number!=0){
            digit=number%10;
            sum+= (int) Math.pow(digit,numberLength);
            number=number/10;
        }
        return sum==givenNumber;
    }


}
