public class firsrtOccurrence {
    static int str(String a, String b) {
        for (int i = 0; i < a.length() - b.length() + 1; ++i) {
            if (a.substring(i, b.length() + i).equals(b)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(str("abc", "c"));
    }
}
