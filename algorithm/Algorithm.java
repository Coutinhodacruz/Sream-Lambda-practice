package chapter17.algorithm;

import java.util.Arrays;
import java.util.stream.Stream;

public class Algorithm {

    public static long countSpecialCharacter(String[] strings){
        String specialCharacter = "!@#$%^&*()_+{}[]:|?<.>`~\"'";
      long numberOfSpecialCharacters = Arrays.stream(strings)
                .flatMap((element)-> {
                    String[] arr = element.split("");
                    return Stream.of(arr);
                })

                .filter((element)-> specialCharacter.contains(element))
                .count();

        return numberOfSpecialCharacters;
    }
}
