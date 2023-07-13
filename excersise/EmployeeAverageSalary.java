package chapter17.excersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeAverageSalary {
    public static void main(String[] args) {
        List<Employee> employees = createEmployeeList();

        Map<String, Double> averageSalariesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average salaries by department:");
        averageSalariesByDepartment.forEach((department, averageSalary) ->
                System.out.println(department + ": " + averageSalary));
    }

    private static List<Employee> createEmployeeList() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John Doe", "IT", 5000));
        employees.add(new Employee("Jane Smith", "HR", 4000));
        employees.add(new Employee("Mike Johnson", "IT", 6000));
        employees.add(new Employee("Emily Davis", "Finance", 5500));
        employees.add(new Employee("Mark Wilson", "HR", 4500));
        return employees;
    }

    private static class Employee {
        private String name;
        private String department;
        private double salary;

        public Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }
    }
}
