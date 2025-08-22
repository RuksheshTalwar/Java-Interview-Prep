package interview.questions.streams.programs.interviewquestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "rukshesh is a great guy";
        System.out.println(firstNonRepeatingCharacter(str));
    }

    private static char firstNonRepeatingCharacter(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }
}
