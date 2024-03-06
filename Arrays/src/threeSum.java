import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class threeSum {
    static List<List<Integer>> threeSum(int[] arr) {
        HashSet<List<Integer>> ans = new HashSet<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int l = i + 1;
            int h = arr.length - 1;
            while (l < h) {
                int sum = arr[i] + arr[l] + arr[h];
                if (sum == 0) {
                    ans.add(Arrays.asList(arr[i], arr[l], arr[h]));
                    l++;
                    h--;
                } else if (sum < 0) {
                    l++;
                } else {
                    h--;
                }
            }
        }
        return new ArrayList<>(ans);
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        for (List<Integer> x : threeSum(arr)) {
            System.out.print(x + " ");
        }
    }
}