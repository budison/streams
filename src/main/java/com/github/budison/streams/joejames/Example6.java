package com.github.budison.streams.joejames;

import java.util.Arrays;

class Example6 {

    public static void main(String[] args) {

        // Average of squares of an int array
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);

        // Mapping only
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .forEach(System.out::println);
    }
}
