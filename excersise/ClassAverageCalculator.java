package chapter17.excersise;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class ClassAverageCalculator {
    public static void main(String[] args) {
        List<Integer> grades = readGrades();
        double average = calculateClassAverage(grades);
        System.out.println("Class Average: " + average);
    }

    private static List<Integer> readGrades() {
        List<Integer> grades = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integer grades (Enter -1 to finish):");

        while (true) {
            int grade = scanner.nextInt();

            if (grade == -1) {
                break;
            }

            grades.add(grade);
        }

        return grades;
    }

    private static double calculateClassAverage(List<Integer> grades) {
        OptionalDouble average = grades.stream()
                .mapToDouble(Integer::doubleValue)
                .average();

        return average.orElse(0.0);
    }
}
