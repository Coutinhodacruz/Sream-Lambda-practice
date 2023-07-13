package chapter17.excersise;

import java.util.Arrays;

public class AverageCalculator {
    public static void main(String[] args) {
        int[][] grades = {
                {90, 85, 95},
                {70, 80, 75},
                {88, 92, 87},
                {95, 91, 89},
                {80, 82, 78},
                {85, 87, 84},
                {79, 83, 81},
                {92, 90, 94},
                {86, 88, 83},
                {75, 77, 72}
        };

        double average = Arrays.stream(grades)
                .flatMapToInt(Arrays::stream)
                .average()
                .orElse(0.0);

        System.out.println("Average of all grades: " + average);
    }
}
