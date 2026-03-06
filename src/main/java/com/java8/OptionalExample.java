package com.java8;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        // beforeJava8();
        afterJava8();
    }

    public static void beforeJava8() {
        String[] str = new String[10];
        String lowerCase = str[5].toLowerCase();
        System.out.println(lowerCase);
    }

    public static void afterJava8() {
        String[] str = new String[10];
        str[5] = "Surendra";

        Optional<String> empty = Optional.empty();
        System.out.println(empty);

        Optional<String> value = Optional.of(str[5]);
        System.out.println(value);

        Optional<String> valueOf = Optional.ofNullable(str[7]);
        System.out.println(valueOf);

    }

}
