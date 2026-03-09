package com.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeateChar {
    public static void main(String[] args) {
        //Java program to find first non-repeat element from a given string
        final String nonRepeateChar = firstNonRepeateChar("surendrakondru");
        System.out.println("First Non Repeat Char :: " + nonRepeateChar);
    }

    public static String firstNonRepeateChar(String str) {
        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .findFirst()
                .orElse(null);
    }
}
