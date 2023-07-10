package chapter17.lambdas.doublePredicate;

import java.util.function.DoubleToIntFunction;

public class Account {
    public static void main(String[] args) {
//        DoublePredicate doublePredicate = (number) -> {
//            return number == 3.0;
//        };
//        boolean result = doublePredicate.test(4.5);
//        System.out.println(result);

        DoubleToIntFunction function = (number) ->{
          return 3;
       };
   }
}
