package com.java8;

import java.util.Arrays;

public class FindLongestString {

    public static void main(String[] args) {
        //Java program to find the longest string from given array
        String[] str = new String[]{"java", "spring", "springboot", "microservice", "j2ee", "aws", "docker"};
        String longestString = findLongestString(str);
        String longestString2 = findSecondLongestString(str);
        System.out.println("Longest String :: " + longestString);
        System.out.println("Second Longest String :: " + longestString2);
    }

    public static String findLongestString(String[] str) {
        return Arrays.stream(str)
                .reduce((a, b) -> a.length() > b.length() ? a : b)
                .orElse("");



      /*  return Arrays.stream(str)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .orElse(null);
      */
    }

    public static String findSecondLongestString(String[] str) {

        return Arrays.stream(str)
                // .sorted(Comparator.comparingInt(String::length).reversed())
                .sorted((s1, s2) -> s2.length() - s1.length())
                .skip(1)
                .findFirst()
                .orElse(null);
    }
}
