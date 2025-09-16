package interview.questions.streams.programs.interviewquestions;

import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {
        Integer[] arr = {44,55,89,90,34,56, 44, 56, 89};
        Arrays.sort(arr);
        //LinkedHashSet class preserves the insertion order
        Set<Integer> set = new LinkedHashSet<>();
        for(Integer i : arr) {
            set.add(i);
        }
        set.forEach(i-> System.out.println(i));
//        List<String> words = Arrays.asList("bat", "tab", "tap", "pat", "top", "pot", "opt");
//
//        Map<String, Set<String>> anagramMap = new LinkedHashMap<>();
//
//        for (String word : words) {
//            // Convert word to character array, sort it, then use as key
//            char[] chars = word.toCharArray();
//            Arrays.sort(chars);
//            String sortedKey = new String(chars);
//
//            // Use LinkedHashSet to preserve insertion order
//            if (!anagramMap.containsKey(sortedKey)) {
//                anagramMap.put(sortedKey, new LinkedHashSet<>());
//            }
//
//            anagramMap.get(sortedKey).add(word);
//        }
//
//        // Print the grouped anagrams
//        for (Set<String> group : anagramMap.values()) {
//            System.out.println(group);
//        }
    }
}

