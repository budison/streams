package com.github.budison.streams.joejames;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class Example9 {

    public static void main(String[] args) throws IOException {

        // Stream rows from text file and save to List
        List<String> bands = Files.lines(Paths.get("src/main/resources/bands.txt"))
                .filter(x -> x.contains("jit"))
                .toList();  // short for .collect(Collectors.toList())
        bands.forEach(System.out::println);
    }
}
