package interview.questions.streams.programs.interviewquestions;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UsingMaxExamples {
    public static void main(String[] args) {
        var students = List.of(
                new Student("John", 3.4),
                new Student("Emma", 3.9),
                new Student("Ryan", 3.6)
        );

        /**
         * 1 -> Program to Find the latest Date
         */
        var dates = List.of(
                LocalDate.of(2022, 5, 20),
                LocalDate.of(2023, 3, 15),
                LocalDate.of(2021, 12, 10)
        );
        LocalDate latest = dates.stream()
                .max(LocalDate::compareTo)
                .orElse(null);

        // Output: 2023-03-15
        System.out.println("Latest date: " + latest);

        /**
         * 2 -> Program to Remove the duplicates from a String and return the String in the same order
         */
        String str = "rukshesh is a great guy";
        removeDuplicates(str);

        /**
         * 3 -> Program to Find the Student with the Highest GPA
         */
        Student topStudent = students.stream()
                .max(Comparator.comparingDouble(Student::getGpa))
                .orElse(null);
        System.out.println("Top student: " + (topStudent != null ? topStudent.name : "None"));
    }

    private static String removeDuplicates(String str) {
        return str.chars()
                .mapToObj(i -> (char) i)
                .distinct()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}

    class Student {
        String name;
        double gpa;

        Student(String name, double gpa) {
            this.name = name;
            this.gpa = gpa;
        }

        public double getGpa() {
            return this.gpa;
        }

    }

