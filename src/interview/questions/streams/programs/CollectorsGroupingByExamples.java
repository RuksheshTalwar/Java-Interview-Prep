package interview.questions.streams.programs;

import java.util.*;
import java.util.stream.Collectors;


class Employee {
    String name;
    String department;

    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

public class CollectorsGroupingByExamples {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Charlie", "IT"),
                new Employee("David", "Finance"),
                new Employee("Eve", "HR")
        );

        // Group employees by department
        Map<String, List<Employee>> groupedByDepartment = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.department));

        System.out.println(groupedByDepartment);
    }
}
