package chapter17.stream.intermediateOperations;

import java.util.List;

public class Map {
    public static void main(String[] args) {
        List<String> words = List.of("House", "Rain", "Weather", "Bridge", "Road");

       int sum = words.stream()
                .map(String::length)
                .reduce(0, Integer::sum);

        System.out.println(sum);
    }
}
