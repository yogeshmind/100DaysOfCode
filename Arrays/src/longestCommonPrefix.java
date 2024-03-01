import java.util.Arrays;

public class longestCommonPrefix {
    static String locp(String[] str) {
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length - 1];
        int i = 0;
        while (i < s1.length()) {
            if (s1.charAt(i) == s2.charAt(i)) {
                i++;
            } else {
                break;
            }
        }
        return i == 0 ? "" : s1.substring(0, i);
    }

    public static void main(String[] args) {

        String[] str = {"Ramesh", "Rajesh", "Rajni"};
        System.out.println(locp(str));
    }
}
