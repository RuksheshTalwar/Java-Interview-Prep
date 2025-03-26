package interview.questions.comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Student2> {
    public int compare(Student2 s1,Student2 s2){
        return s1.name.compareTo(s2.name);
    }
}