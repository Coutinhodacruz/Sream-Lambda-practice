package chapter17.excersise;

import java.util.Arrays;
import java.util.stream.DoubleStream;

public class IndividualAverageCalculator {
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

        DoubleStream studentAverages = Arrays.stream(grades)
                .mapToDouble(gradesRow -> Arrays.stream(gradesRow).average().orElse(0.0));

        studentAverages.forEach(average -> System.out.println("Individual Average: " + average));
    }
}
