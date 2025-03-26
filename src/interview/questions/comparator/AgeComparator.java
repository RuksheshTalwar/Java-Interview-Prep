package interview.questions.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student2> {
    public int compare(Student2 s1,Student2 s2) {
        if(s1.age==s2.age)
            return 0;
        else if(s1.age>s2.age)
            return 1;
        else
            return -1;
    }
}
