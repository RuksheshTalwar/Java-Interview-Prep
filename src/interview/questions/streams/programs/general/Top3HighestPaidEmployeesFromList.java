package interview.questions.streams.programs.general;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Question : We have to find Top 3 highest-paid employees from each department,
 * from the given list of Employees
 */
public class Top3HighestPaidEmployeesFromList {
    public static void main(String[] args) {
        Map<String, List<Employee>> employeeNamesGroupedByDepartment = createEmployeeData();
        employeeNamesGroupedByDepartment.forEach((k,v) -> {
            String names = v.stream()
                    .map(Employee::getName)
                    .collect(Collectors.joining(","));
            System.out.println(k + " ----- " + names);
        });
    }

    private static Map<String, List<Employee>> createEmployeeData() {
        List<Employee> employees = List.of(new Employee("Rukshesh", "IT", 2500.50),
                new Employee("Himanshi", "IT", 3500.50),
                new Employee("Himanshi2", "IT", 3600.50),
                new Employee("Himanshi3", "IT", 3700.50),
                new Employee("John", "Engineering", 3600.50),
                new Employee("Sam", "Engineering", 3700.50),
                new Employee("Ghansham", "Engineering", 3800.50),
                new Employee("Ghansham2", "Engineering", 3900.50),
                new Employee("Ram", "HR", 4500.50),
                new Employee("Ram2", "HR", 4600.50),
                new Employee("Ram3", "HR", 4700.50),
                new Employee("Sham", "ADMIN", 5500.50),
                new Employee("Sham2", "ADMIN", 5600.50),
                new Employee("Sham3", "ADMIN", 5700.50));

        Map<String, List<Employee>> output = employees.stream()
                .collect(Collectors.groupingBy(
                    Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                emp -> emp.stream()
                                        .sorted(Comparator.comparingDouble(
                                                Employee::getSalary
                                        ).reversed())
                                        .limit(3)
                                        .toList()
                        )
                ));

        return output;
    }
}

class Employee {
    String name;
    String department;
    Double salary;

    Employee(String name, String department, Double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
