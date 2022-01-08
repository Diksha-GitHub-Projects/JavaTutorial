package org.java.tutorial;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsExample {
    public static void main(String[] args) {

        List<Integer> data = Arrays.asList(1, 2, 3, 4,1,2,3,4);
        System.out.println(data.stream().map(x -> String.valueOf(x+1)).collect(Collectors.joining("--")));

        Map<Integer,List<Integer>> groupByData = data.stream().collect(Collectors.groupingBy(x -> x));
        groupByData.entrySet().stream().forEach((x) -> System.out.println(x.getKey() + " " +x.getValue()));

        // partition by creates only two keys true or false
        Map<Boolean,List<Integer>> partitionByData = data.stream().collect(Collectors.partitioningBy(x -> x > 1));
        Map<Integer,Long> transformedData = groupByData.entrySet().stream().
                collect(Collectors.toMap(x -> x.getKey(),
                x -> x.getValue().stream().collect(Collectors.counting())));

        transformedData.entrySet().stream().forEach(x -> System.out.println(x.getKey() +" " +
                x.getValue()));

    }
}
