package org.example.interviewcore;

import java.util.List;

public class StreamExecutionOrder {
    public static void main(String[] args) {
        List<String> data = List.of("one", "two", "three");

        data.stream()
                .map(s -> {
                    System.out.println("Mapping: " + s);
                    return s.toUpperCase();
                })
                .filter(s -> {
                    System.out.println("Filtering: " + s);
                    return s.length() > 3;
                })
                .limit(1)
                .forEach(System.out::println);
    }
}
// Каков порядок вывода?
