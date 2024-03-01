public class reverseWordsInString {
    static String rwis(String str) {
        String[] s = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for (int i = s.length - 1; i >= 0; i--) {
            sb.append(s[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String str = "  Hello        world ";
        System.out.println(rwis(str));
    }
}
