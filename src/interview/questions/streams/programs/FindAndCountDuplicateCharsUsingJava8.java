package interview.questions.streams.programs;

import java.util.HashMap;
import java.util.Map;

public class FindAndCountDuplicateCharsUsingJava8 {
    public static void main(String[] args) {
        String str = "my name is rukshesh";
        char[] arr = str.toCharArray();
        Map<Character, Integer> m = new HashMap<>();
        for (Character ch : arr) {
            if (m.containsKey(ch)) {
                m.put(ch, m.get(ch) + 1);
            } else {
                m.put(ch, 1);
            }
        }
        m.entrySet()
                .stream()
                .filter(e -> e.getValue() > 1)
                .forEach(i -> System.out.println(i.getKey()));
//        int count = 0;
//        m.entrySet()
//                .stream()
//                .filter(e -> e.getValue() > 1)
//                .forEach(i -> System.out.println("count of duplicate characters : "+ (count++) + i.getKey()));
    }
}
