package main.java.string_coding_questions;

import java.util.HashMap;
import java.util.Map;

/**
 * Given string str, the task is to find the length of the longest
 * substring of str such that no three consecutive characters in the
 * substring are same.
 * Input: str = “baaabbabbb” Output: 7” 
 */

public class SubstringWith3ConsecutiveChars {
    public static void main(String[] args) {
        String str = "baaabbabbb";

//        Map<Character, Integer> map = new HashMap<>();
//        int l = 0;
//        int r = 0;
//        for (int i = 0; i < str.length(); i++) {
//            while (r < str.length()) {
//                if (map.containsKey(str.charAt(r)))
//                r++;
//            }
//        }

        int maxLength = 1;
        int currentLength = 1;
        int repeatCount = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                repeatCount++;
                if (repeatCount < 3) {
                    currentLength++;
                } else {
                    currentLength = 2; // keep last two characters
                    repeatCount = 2;
                }
            } else {
                repeatCount = 1;
                currentLength++;
            }
            maxLength = Math.max(maxLength, currentLength);
        }

        System.out.println("Optimal Output: " + maxLength);
    }
}
