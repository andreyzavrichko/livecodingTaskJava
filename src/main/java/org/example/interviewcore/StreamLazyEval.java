package org.example.interviewcore;

import java.util.List;

public class StreamLazyEval {
    public static void main(String[] args) {
        List<String> data = List.of("x", "xx", "xxx");

        data.stream()
                .filter(s -> {
                    System.out.println("Filtering: " + s);
                    return s.length() > 1;
                });
    }
}
// Почему ничего не выводится в консоль?
