public class selectionSort {
    static int[] selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min_ind = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_ind]) {
                    min_ind = j;
                }
            }
            int temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 3, 9, 7};
        int n = arr.length;
        for (int x : selectionSort(arr, n)) {
            System.out.print(x + " ");
        }
    }
}
