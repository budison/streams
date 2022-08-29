package com.github.budison.streams;

import java.util.stream.IntStream;

class Example3 {

    public static void main(String[] args) {

        // 3. Integer Stream with sum
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum()
        );
        System.out.println();
    }
}
