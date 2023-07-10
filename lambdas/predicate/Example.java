package chapter17.lambdas.predicate;

import java.util.Set;

public class Example {
    public static void main(String[] args) {
        Set<Integer> numbers = Set.of(1,3,4,5,7,8);
        numbers.stream().filter(number-> number%2==0)

                .forEach(System.out::println);


    }
}
