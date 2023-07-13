package chapter17.stream.intermediateOperations;

import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Collection {
    public static void main(String[] args) {
        List<String> words = List.of(
                "Java", "Python",
                "C++",  "Go",
                "Rust"
        );


        Function<String, String> keyMapper = (word)-> word;

        Function<String, Integer> valueMapper = (word)-> word.length();

        BinaryOperator<Integer> mergeFunction = (word, duplicate)-> word+duplicate;

         Map<String, Integer> languages=words.stream()
                .filter((word) ->word.length()>2)
                .collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction));

        System.out.println(languages);
    }

}
