package chapter17.excersise;

import java.security.SecureRandom;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;
import java.util.stream.IntStream;

public class DieRollTiming {
    public static void main(String[] args) {

        SecureRandom secureRandom = new SecureRandom();
        Instant startSecureRandom = Instant.now();
        rollDie(secureRandom);
        Instant endSecureRandom = Instant.now();
        Duration durationSecureRandom = Duration.between(startSecureRandom, endSecureRandom);
        long millisecondsSecureRandom = durationSecureRandom.toMillis();
        System.out.println("Time taken with SecureRandom: " + millisecondsSecureRandom + " milliseconds");


        Random random = new Random();
        Instant startRandom = Instant.now();
        rollDie(random);
        Instant endRandom = Instant.now();
        Duration durationRandom = Duration.between(startRandom, endRandom);
        long millisecondsRandom = durationRandom.toMillis();
        System.out.println("Time taken with Random: " + millisecondsRandom + " milliseconds");
    }

    private static void rollDie(Random random) {
        IntStream dieRolls = random.ints(60_000_000, 1, 7);
        long count = dieRolls.count();
        System.out.println("Total die rolls: " + count);
    }
}
