package chapter17.stream.intermediateOperations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Python");
        words.add("C++");
        words.add("Rust");

        Collections.sort(words);

        int index = Collections.binarySearch(words, "python");
        System.out.println("python found at index:" + index);

        String maximum = Collections.max(words);
        System.out.println(maximum);

        System.out.println(words);



    }

}
