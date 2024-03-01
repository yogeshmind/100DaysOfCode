public class countOnesInBinaryArray {
    static int count(int[] arr) {
        int l = 0;
        int h = arr.length - 1;
        int count = 0;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == 1) {
                count = mid + 1;
                l = mid + 1;
            }
            if (arr[mid] == 0) {
                h = mid - 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1, 0, 0, 0};
        System.out.println("The no. of 1's present in array is: " + count(arr));
    }
}
