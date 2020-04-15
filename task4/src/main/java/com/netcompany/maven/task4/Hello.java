package com.netcompany.maven.task4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Hello {

    public static void main(final String[] args) {

        System.out.println(
                Arrays.asList("Hello,", "Goodbye,", "world!").stream()
                                                             .filter(s -> !s.contains("Goodbye"))
                                                             .collect(Collectors.joining(" ")));
    }
}
