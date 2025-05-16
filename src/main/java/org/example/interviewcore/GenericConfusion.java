package org.example.interviewcore;

import java.util.ArrayList;
import java.util.List;

public class GenericConfusion {
    public static void main(String[] args) {
        List raw = new ArrayList();
        raw.add("hello");
        raw.add(42);
        for (Object obj : raw) {
            System.out.println(obj);
        }
    }
}
// Какие типы могут оказаться в списке? Почему это возможно?