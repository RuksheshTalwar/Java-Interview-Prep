package interview.questions.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorAndComparable {
    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1;
                else
                    return -1;
            }
        };
        List<String> strs = new ArrayList<>();
        strs.add("rukshesh");
        strs.add("himanshis");
        strs.add("trijal");
        strs.add("netik");

        Collections.sort(strs, comparator);
        System.out.println(strs);
    }


}
