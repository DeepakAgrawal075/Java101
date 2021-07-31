package streams;

import java.util.function.BiFunction;

public class BiFunctionDemoAnonymousInnerClass {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = new BiFunction<Integer, Integer, Integer>() {

            @Override
            public Integer apply(Integer integer1, Integer integer2) {
                return integer1 + integer2;
            }
        };
        System.out.println(biFunction.apply(10, 20));
    }
}