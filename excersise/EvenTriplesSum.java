package chapter17.excersise;

import java.util.stream.IntStream;

public class EvenTriplesSum {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(2, 10)
                .filter(n -> n % 2 == 0)
                .map(n -> n * 3)
                .sum();

        System.out.println("Sum of the triples of even integers from 2 to 10: " + sum);
    }
}
