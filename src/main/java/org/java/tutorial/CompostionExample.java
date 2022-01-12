package org.java.tutorial;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CompostionExample {

    public static void main(String[] args) {

        List<String> data = Arrays.asList("hello","bye","tada");
        List<Integer> intData = Arrays.asList(1,2,3);

        Optional<Integer> naturalOrder = intData.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
        Optional<String> reverseOrder = data.stream().collect(Collectors.maxBy(String::compareTo));


        System.out.println(naturalOrder.orElse(0));
        System.out.println(reverseOrder.orElse("NAN"));



        Function<String,String> x1 = x -> x.toUpperCase();
        Function<String,String> x2 = x -> x + "_";

        Function<String,String>  x3 = x1.andThen(x2);

        data.stream().map(x3).collect(Collectors.toSet()).stream().forEach(System.out::println);
    }
}
