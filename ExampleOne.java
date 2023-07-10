package chapter17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOne {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(65);
        numbers.add(55);
        numbers.add(45);
        numbers.add(25);

        Stream<Integer> initialStream =numbers.stream();
        Stream<Integer> streamAfterFilter = initialStream.filter((number) -> number % 2 != 0);
        streamAfterFilter.forEach((number) -> System.out.println(number));
    }
}
