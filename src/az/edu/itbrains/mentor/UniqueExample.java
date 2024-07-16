package az.edu.itbrains.mentor;

public class UniqueExample {
    public static void main(String[] args) {

    }

    public static int noDuplicate(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                sum += nums[i];
            }
        }
        return sum;
    }
}

