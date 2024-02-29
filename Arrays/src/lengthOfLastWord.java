public class lengthOfLastWord {
    static int lolw(String str) {
        int count = 0;
        String s = str.trim();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Hello world  is  ";
        System.out.println(lolw(str));
    }
}
