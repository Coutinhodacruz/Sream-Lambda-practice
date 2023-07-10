package chapter17.stream.intermediateOperations;

import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> list = List.of(
                List.of(1,2,3,4,5,6),
                List.of(10,20,30,40,50),
                List.of(100, 200, 300, 400)
        );

        list.stream()
                .flatMap((element) -> element.stream())
                .forEach(System.out::println);


    }
}
