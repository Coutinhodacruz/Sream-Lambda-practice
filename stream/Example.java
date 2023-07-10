package chapter17.stream;




import java.util.Random;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) {
        Random random = new Random();
        Stream<Integer> stream = Stream.generate(() -> random.nextInt()).limit(5);
        stream.forEach((num) -> System.out.println(num));

    }
}
