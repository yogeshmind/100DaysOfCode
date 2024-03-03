public class isSubsequence {
    static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                sb.append(t.charAt(j));
                i++;
                j++;
            } else {
                j++;
            }
        }
        if (i == s.length()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "c";
        String t = "abc";
        System.out.println(isSubsequence(s, t));

    }
}
