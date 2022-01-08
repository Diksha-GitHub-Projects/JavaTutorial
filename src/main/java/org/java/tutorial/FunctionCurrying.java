package org.java.tutorial;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionCurrying {
    public static void main(String[] args) {
        Function<Integer, BiFunction<Integer,Integer,Integer>> x1 =
                (x) -> (y,z) -> x + y + z;

        BiFunction<Integer,Integer,Integer> x2 = x1.apply(3);
        int x3 = x2.apply(5,6);
        System.out.println("x3: "+x3);



    }
}
