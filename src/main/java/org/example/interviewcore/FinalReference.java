package org.example.interviewcore;

import java.util.ArrayList;
import java.util.List;

public class FinalReference {
    public static void main(String[] args) {
        final List<String> list = new ArrayList<>();
        list.add("A");
        // list = new ArrayList<>(); //перед выполнением необходимо раскомментировать строку: list = new ArrayList<>();
    }
}
// Что произойдёт при компиляции и выполнении?