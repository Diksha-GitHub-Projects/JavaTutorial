package org.java.tutorial;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(1, 2, 3, 4);
        System.out.println(data.stream().map(x -> String.valueOf(x+1)).collect(Collectors.joining("--")));


    }
}
