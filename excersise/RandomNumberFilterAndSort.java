package chapter17.excersise;

import java.security.SecureRandom;
import java.util.stream.IntStream;

public class RandomNumberFilterAndSort {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        IntStream randomNumbersStream = secureRandom.ints(50, 1, 1000);
        IntStream oddNumbersStream = randomNumbersStream.filter(n -> n % 2 != 0);
        IntStream sortedOddNumbersStream = oddNumbersStream.sorted();

        sortedOddNumbersStream.forEach(System.out::println);
    }
}
