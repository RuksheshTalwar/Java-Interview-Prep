package interview.questions.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class SortUsingComparable {
    public static void main(String args[]) {
        System.out.println(10 + 20 + "Java"); // 30Java
        System.out.println("Java" + 10+ 20); //Java1020
        System.out.println('A' + 1); //66
        // Character gets implicitly converted into String,
        // so they get concatenated together
        System.out.println('A' + "1");//A1
        // Blank String or any string concatenated with Boolean type,
        // Output will be converted into String
        System.out.println(true + "great");//truegreat
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        Collections.sort(al);
        for (Student st : al) {
//            System.out.println(st.name + " " + st.age);
        }
    }
}


class Student implements Comparable<Student> {
    int rollNo;
    String name;
    int age;

    Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student obj2) {
        return this.name.compareTo(obj2.name);
    }
}
