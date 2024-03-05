public class mergeTwoSortedArray {
    static int[] merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                arr[k] = b[j];
                j++;
                k++;
            }
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++;
                k++;
            }
        }
        while (i < a.length) {
            arr[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            arr[k] = b[j];
            j++;
            k++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5};
        int[] b = {4, 6, 7, 8, 9};
        for (int x : merge(a, b)) {
            System.out.print(x + " ");
        }
    }
}
