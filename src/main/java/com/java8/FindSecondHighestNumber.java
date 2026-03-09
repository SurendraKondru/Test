package com.java8;

import java.util.Arrays;
import java.util.Comparator;

public class FindSecondHighestNumber {

    public static void main(String[] args) {
        // Java program to find second-highest number from given array
        final int secondHighestNumber = findSecondHighestNumber(new int[]{10, 20, 5, 2, 11, 34, 8, 9, 12});
        System.out.println("Second Highest Number :: " + secondHighestNumber);
    }

    public static int findSecondHighestNumber(int[] nums) {

        return Arrays.stream(nums).boxed()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

    }
}
