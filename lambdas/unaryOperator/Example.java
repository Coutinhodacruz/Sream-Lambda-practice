package chapter17.lambdas.unaryOperator;

import java.util.function.UnaryOperator;

public class Example {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = (number) -> {
            return number * 2;

        };
        Integer result = unaryOperator.apply(5);
        System.out.println(result);

    }
}
