package chapter17.stream.intermediateOperations;


import java.util.Set;

public class Filter {

    public static void main(String[] args) {

        Set<Integer> numbers = Set.of(10,30,40,50,70,80);
        numbers.stream().filter(number-> number%2==0)

                .forEach(System.out::println);
    }
}
