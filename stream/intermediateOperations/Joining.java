package chapter17.stream.intermediateOperations;

import java.util.List;
import java.util.stream.Collectors;

public class Joining {
    public static void main(String[] args) {
        List<String> words = List.of(
                "Java", "Python",
                "C++",  "Go",
                "Rust"
        );

        String result = words.stream()
                .filter((word)->word.length()>2)
                .collect(Collectors.joining("::" , "[" ,"]"));

        System.out.println(result);
    }

}
