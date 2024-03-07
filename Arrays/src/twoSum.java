public class twoSum {
    static int[] twoSum(int[] arr, int t) {
        int l = 0;
        int h = arr.length - 1;
        int[] Arr = new int[2];
        while (l <= h) {
            int temp = arr[l] + arr[h];
            if (temp > t) {
                h--;
            }
            if (temp < t) {
                l++;
            }
            if (t == temp) {
                Arr[0] = l + 1;
                Arr[1] = h + 1;
                break;
            }
        }
        return Arr;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0};
        int t = -1;
        for (int x : twoSum(arr, t)) {
            System.out.print(x + " ");
        }
    }
}