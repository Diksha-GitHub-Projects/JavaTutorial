package org.java.tutorial;

import java.util.function.BiFunction;

public class BiFunctionInterfaceExample<I extends Number, I1 extends Number, I2 extends Number> {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunc = (x,y) -> x+y;
        int output1 = biFunc.apply(2,3);
        System.out.println("output1: "+ output1);

        BiFunction<Integer,Integer,Integer> biFunc1 = BiFunctionInterfaceExample::add;
        int output2 = biFunc1.apply(7,8);
        System.out.println("output2: "+ output2);

        NoArgFunction<String> noArgFunc = ()-> "Hello Tutorial";
        System.out.println(noArgFunc.apply());
    }

    public static int add(int a, int b){
        return a+b;
    }
}
