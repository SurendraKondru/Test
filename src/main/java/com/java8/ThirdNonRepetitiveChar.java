package com.java8;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class ThirdNonRepetitiveChar {

    public static void main(String[] args) {
        final String nonRepeatingChar = findThirdNonRepeatingChar("microservices");
        System.out.println(nonRepeatingChar);
    }

    public static String findThirdNonRepeatingChar(String str) {
        return Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(key -> key, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(value -> value.getKey())
                .skip(2)
                .findFirst()
                .orElse(null);
    }
}
