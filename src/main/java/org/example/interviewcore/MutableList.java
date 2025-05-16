package org.example.interviewcore;

import java.util.List;

public class MutableList {
    public static void main(String[] args) {
        List<String> list = List.of("A", "B");
        list.set(1, "C");
        System.out.println(list);
    }
}
// Упадёт ли программа? Почему?

