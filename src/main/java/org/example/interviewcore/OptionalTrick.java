package org.example.interviewcore;

import java.util.Optional;

public class OptionalTrick {
    public static void main(String[] args) {
        Optional<String> opt = Optional.ofNullable(null);
        System.out.println(opt.orElse("default").toUpperCase());
    }
}
// Что будет выведено?

