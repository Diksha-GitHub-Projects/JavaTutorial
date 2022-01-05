package org.java.tutorial;

import sun.font.CreatedFontTracker;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class ReturnFunctionFromMethod {
    public static void main(String[] args) {
        NoArgFunction<String> func = returnValueAsFunction("Tutorial");
        System.out.println(func.apply());

        System.out.println(returnValueAsFunction1(2).apply(3));
        BiFunction<Integer, Integer, Integer> biFunc = (x, y) -> x * y;

        Function<BiFunction<Integer, Integer, Integer>,BiFunction<Integer, Integer, Integer>> newFunc =
                (func_1) -> (x, y) -> {
                    if (y == 0) {
                        System.out.println("y parameter is zero");
                        return 0;
                    }
                    return func_1.apply(x,y);
                };

        BiFunction<Integer,Integer,Integer> x = newFunc.apply((x1,y1) -> x1*y1);
        x.apply(2,0);
    }

    public static NoArgFunction<String> returnValueAsFunction(String name) {
        return () -> "Hello " + name;
    }

    public static Function<Integer, Integer> returnValueAsFunction1(int y) {
        return (x) -> x * y;
    }


}
