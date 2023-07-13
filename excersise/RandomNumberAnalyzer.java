package chapter17.excersise;

import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumberAnalyzer {
    public static void main(String[] args) {
        int[] numbers = generateRandomNumbers(10);
        displayNumberStats(numbers);
    }

    private static int[] generateRandomNumbers(int count) {
        Random random = new Random();
        return random.ints(count, 0, 1001).toArray();
    }

    public static void displayNumberStats(int[] numbers) {
        System.out.println("Generated numbers: ");
        IntStream.of(numbers).forEach(System.out::println);

        long oddCount = IntStream.of(numbers)
                .filter(number -> number % 2 != 0)
                .count();
        long evenCount = IntStream.of(numbers)
                .filter(number -> number % 2 == 0)
                .count();

        double overallAverage = IntStream.of(numbers)
                .average()
                .orElse(0.0);
        double oddAverage = IntStream.of(numbers)
                .filter(number -> number % 2 != 0)
                .average()
                .orElse(0.0);
        double evenAverage = IntStream.of(numbers)
                .filter(number -> number % 2 == 0)
                .average()
                .orElse(0.0);

        System.out.println("Odd count: " + oddCount);
        System.out.println("Even count: " + evenCount);
        System.out.println("Overall average: " + overallAverage);
        System.out.println("Odd numbers average: " + oddAverage);
        System.out.println("Even numbers average: " + evenAverage);
    }
}
