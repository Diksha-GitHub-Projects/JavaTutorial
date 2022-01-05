package org.java.tutorial;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionsAsArgument {
    public static void main(String[] args) {
        int addValue = combinedMethod(FunctionsAsArgument::add,2,3);
        System.out.println("add value: "+addValue);
        int subtractValue = combinedMethod(FunctionsAsArgument::subtract,3,2);
        System.out.println("subtract value: "+subtractValue);

        BiFunction<Integer,Integer,Integer> anyFunc = (x,y) -> x*y;
        int anyValue = combinedMethod(anyFunc , 1, 1);
        System.out.println(anyValue);
    }

    public static int add(Integer x , Integer y){
        return x + y;
    }

    public static int subtract(Integer x , Integer y){
        return x - y;
    }

    public static int combinedMethod(BiFunction<Integer,Integer,Integer> func, int x, int y){
        return func.apply(x,y);
    }
}
