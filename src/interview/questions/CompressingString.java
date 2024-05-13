package interview.questions;

public class CompressingString {
    public static void main(String[] args) {
        String res = compressString("aaabbcccaa");
        String res1 = compressString("aaaa");
        System.out.println(res);
        System.out.println(res1);
    }

    static String compressString(String str) {
        if (str == null || str.isBlank()) {
            return "";
        }
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i< str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i-1)).append(count);
                count = 1;
            }
        }
        sb.append(str.charAt(str.length() - 1)).append(count);
        if (sb.toString().length() < str.length()) {
            return str;
        } else {
            return sb.toString();
        }
    }
}
