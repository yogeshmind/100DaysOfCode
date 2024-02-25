import java.util.HashSet;

public class subarrayWithZeroSum {
    // Method 1 Using Naive Approach
    static boolean naiveApproach(int[] arr, int n, int sum) {
        for (int i = 0; i < n; i++) {
            int currSum = arr[i];
            if (currSum == sum) {
                return true;
            } else {
                for (int j = i + 1; j < n; j++) {
                    currSum += arr[j];
                    if (currSum == sum) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Method 2 Using Hashing
    static boolean hashing(int[] arr) {
        HashSet<Integer> h = new HashSet<>();
        int preSum = 0;
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (h.contains(preSum)) {
                return true;
            }
            if (preSum == 0) {
                return true;
            }
            h.add(preSum);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        int n = arr.length;
        int sum = 0;
        System.out.println(naiveApproach(arr, n, sum));
        System.out.println(hashing(arr));
    }
}
