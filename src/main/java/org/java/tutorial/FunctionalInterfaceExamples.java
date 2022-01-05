package org.java.tutorial;

import java.util.function.Function;

public class FunctionalInterfaceExamples {

    public static void main(String[] args) {

        /*
         Function has one method apply and takes one argument
          we haven't specified type with x because we have mentioned that in Function< Input type, Outputtype>
        */

        Function<Integer, Integer> func = x -> x * 2;
        System.out.println(func.apply(2));

        Function<Integer,Integer> func1 = FunctionalInterfaceExamples::add;
        System.out.println(func1.apply(4));

        Function<Integer,String> func2 = x -> x%2 ==0 ? "even" : "odd";
        System.out.println(func2.apply(4));

        Function<Integer,Integer> func3 = x -> {
            if (x > 3) {
                System.out.println("x:" + x);
                return x;
            }
            return 0;
        };

        System.out.println(func3.apply(2));

        TriFunction<Integer,Integer,Integer,Double> triFunc = (x,y,z) -> x * y * z * 0.9;
        System.out.println(triFunc.apply(3,4,5));

        System.out.println(add(func.apply(56)));
    }

    public static int add(int x){
         return x + 2;
    }
}
