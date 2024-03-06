public class minSubArrayLength {
    static int min(int[] arr, int target) {
        int n = arr.length, window = 0, left = 0, ans = n + 1;
        for (int right = 0; right < n; right++) {
            window += arr[right];
            while (window >= target) {
                ans = Math.min(ans, right - left + 1);
                window -= arr[left++];
            }
        }
        return ans == n + 1 ? 0 : ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(min(arr, target));
    }
}
