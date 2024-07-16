package az.edu.itbrains.mentor.exam;

/*
3-verilmish integer arrayinda ən çox təkrarlanan ədədi və sayını print edən
method (method array qəbul edir)
Input-- [1,2,3,4,2,3,4,4,3,5,3,3]
Output -- ədəd 3 , dəfə 5
 */
public class IntegerArrayExample {

    public static void frequentElement(int[] arr) {
        int maxFrequent = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            int frequent = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequent++;
                }
                if (frequent > maxFrequent) {
                    maxFrequent = frequent;
                    num = arr[i];
                }
            }
        }
        System.out.println(num + " ededi " + "defe " + maxFrequent);
    }



    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 4, 4, 3, 5, 3, 3};
        frequentElement(array);
    }
}




