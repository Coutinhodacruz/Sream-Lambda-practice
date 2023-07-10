package chapter17.stream.intermediateOperations;

import java.util.List;

public class MapThree {
    public static void main(String[] args) {
        List<String> words = List.of("House", "Rain", "Weather", "Bridge", "Road");

       double sum = words.stream()
                .mapToInt(String::length)
               .mapToObj((element) -> element)
               .mapToDouble((element) -> 2.0 * element)
                .sum();

        System.out.println(sum);
    }
}
