package chapter17.excersise;

import java.util.Scanner;
import java.util.stream.IntStream;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of prime numbers to generate: ");
        int n = scanner.nextInt();

        IntStream primes = IntStream.iterate(2, PrimeNumberGenerator::nextPrime)
                .limit(n);

        System.out.println("The first " + n + " prime numbers are:");
        primes.forEach(System.out::println);
    }

    private static int nextPrime(int number) {
        int next = number + 1;
        while (!isPrime(next)) {
            next++;
        }
        return next;
    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
