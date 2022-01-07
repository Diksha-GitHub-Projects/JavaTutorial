package org.java.tutorial;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MapFunction {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,2,3,4);
        Set<Integer> transformedData = data.stream().map(x -> x+1).filter(x -> x > 2).collect(Collectors.toSet());
        for(int i : transformedData){
            System.out.println(i);
        }

        System.out.println(transformedData.stream().reduce(1,(x,y) -> x+y));
    }
}
