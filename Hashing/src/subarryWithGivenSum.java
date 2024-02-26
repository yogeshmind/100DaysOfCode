import java.util.HashSet;

public class subarryWithGivenSum {
    static boolean Hashing(int[] arr, int sum) {
        HashSet<Integer> h = new HashSet<>();
        int preSum = 0;
        for (int ele : arr){
            preSum+=ele;
            if (preSum==sum){
                return true;
            }
            if(h.contains(preSum-sum)){
                return true;
            }
            h.add(preSum);
        }return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 20, 3, 10, 5};
        int sum = 33;
        System.out.println(Hashing(arr, sum));
    }
}
