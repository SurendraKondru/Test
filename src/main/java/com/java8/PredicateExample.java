package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PredicateExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3);

        // even number
        List<Integer> collected = list.stream()
                .distinct()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        //System.out.println(collected);

        // 3rd non repeated number

        final Integer integer = list.stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .skip(2)
                .findFirst()
                .orElse(null);

        System.out.println("3rd non repeated number" + integer);

    }
}
