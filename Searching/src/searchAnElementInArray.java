public class searchAnElementInArray {
    static int search(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 5;
        System.out.println("Index of " + k + " in array is: " + search(arr, k));
    }
}
