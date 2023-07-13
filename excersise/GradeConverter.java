package chapter17.excersise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GradeConverter {
    public static void main(String[] args) {
        List<Integer> grades = readGrades();
        List<String> letterGrades = convertToLetterGrades(grades);
        displayLetterGrades(letterGrades);
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

    private static List<String> convertToLetterGrades(List<Integer> grades) {
        return grades.stream()
                .map(GradeConverter::getLetterGrade)
                .collect(Collectors.toList());
    }

    private static String getLetterGrade(int grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    private static void displayLetterGrades(List<String> letterGrades) {
        System.out.println("Letter Grades:");
        for (String letterGrade : letterGrades) {
            System.out.println(letterGrade);
        }
    }
}
