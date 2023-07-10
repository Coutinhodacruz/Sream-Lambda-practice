package chapter17.lambdas.bipredicate;

import java.util.function.BiPredicate;

public class Example {
    public static void main(String[] args) {
        BiPredicate<String, Integer> biPredicate =
                (name, number) -> {
            boolean isNameWithFiveLetters = name.length() == number;
            return  isNameWithFiveLetters;
        };
        boolean result = biPredicate.test("Coutinho", 8);
        System.out.println(result);
    }
}
