package com.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfCharacter {

    //Java program to count the occurrence of each character in a string
    public static void main(String[] args) {
        countOccurrenceOfChar("surendrakondru");
    }

    public static void countOccurrenceOfChar(String str) {
        final Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(map);
    }
}
