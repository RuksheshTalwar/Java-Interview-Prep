public class EqualsMethodUnderstanding {
    public static void main(String[] args) {
        Student s1 = new Student("raj", 20);
        Student s2 = new Student("raj", 20);
        Student s3 = s1;

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }

}

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}