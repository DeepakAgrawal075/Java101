package streams;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemoLambda {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = (integer1, integer2) -> integer1 + integer2;
        Function<Integer, Integer> function = number -> number * number;
        System.out.println(biFunction.andThen(function).apply(10, 20));
    }
}