public class searchElementInSortedArray {
    static int search(int[] arr, int k) {
        int l = 0;
        int h = arr.length - 1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == k) {
                return mid;
            }
            if (arr[mid] > k) {
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 7;
        System.out.println("The index of " + k + " in array is: " + search(arr, k));
    }
}
