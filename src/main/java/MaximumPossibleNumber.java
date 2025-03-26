package main.java;

import java.util.Arrays;
import java.util.Collections;

public class MaximumPossibleNumber {
    public static void main(String[] args) {
        int a = 1234;
        maxPossibleNOFromGivenDigits(a);
    }

    static long maxPossibleNOFromGivenDigits(int num) {
        String s = String.valueOf(num);

        Character[] digits = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i);
        }

        Arrays.sort(digits, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(Character c : digits) {
            sb.append(c);
        }

        return Long.parseLong(sb.toString());
    }
}
