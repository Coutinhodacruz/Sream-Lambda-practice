package chapter17.lambdas.binaryOperator;

import java.util.function.BinaryOperator;

public class Example {
    public static void main(String[] args) {
        BinaryOperator<String> binaryOperator = (name, nickName) -> {
          return "Your name is " +name+" and your aka is : "+ nickName;
        };
        String result = binaryOperator.apply("Coutinho", "Two Hours is your day");
        System.out.println(result);
    }
}
