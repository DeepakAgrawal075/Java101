package streams;

import java.util.function.BiFunction;

public class BiFunctionDemoTraditionalWay implements BiFunction<Integer, Integer, Integer> {

    @Override
    public Integer apply(Integer integer1, Integer integer2) {
        return integer1 + integer2;
    }

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> biFunction = new BiFunctionDemoTraditionalWay();
        System.out.println(biFunction.apply(10, 20));
    }
}