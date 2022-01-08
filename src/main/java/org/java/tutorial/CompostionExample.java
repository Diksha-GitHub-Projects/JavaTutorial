package org.java.tutorial;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CompostionExample {

    public static void main(String[] args) {

        List<String> data = Arrays.asList("hello","bye","tada");

        Function<String,String> x1 = x -> x.toUpperCase();
        Function<String,String> x2 = x -> x + "_";

        Function<String,String>  x3 = x1.andThen(x2);

        data.stream().map(x3).collect(Collectors.toSet()).stream().forEach(System.out::println);
    }
}
