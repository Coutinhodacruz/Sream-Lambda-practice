package chapter17.lambdas.bifunction;

import java.util.function.BiFunction;

public class Example {
    public static void main(String[] args) {
        BiFunction<String ,String, Integer> biFunction =
                (firstWord, secondWord ) -> {
            int lengthOfFirstWord = firstWord.length();
            int lengthOSecondWord = secondWord.length();

            int sum = lengthOfFirstWord + lengthOSecondWord;
            return  sum;
        };

        int result = biFunction.apply("word", "hello");
        System.out.println(result);
    }
}
