package interview.questions.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExample {

    public static void main(String[] args) {
//        String str = "1,11,3,4,5,-6,-8,2555,-243,76";
//        String[] arr = str.split(",");
//        List<String> l = Arrays.asList(arr);
//        List<Integer> l2 = new ArrayList<>();
//        for (int i = 0; i < l.size(); i++) {
////            l.add(String.valueOf(Integer.valueOf(l.get(i))));
//            l2.add(Integer.valueOf(l.get(i)));
//        }
//        Collections.sort(l2);
//        System.out.println(l2);
    }
}

class Student {
    private String name;
    private Integer rollNumber;

    public Integer getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public Student(String name, Integer rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
}
