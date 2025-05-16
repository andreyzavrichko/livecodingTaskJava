package org.example.interviewcore;

import java.util.ArrayList;
import java.util.List;

public class ListRemoval {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));
        for (Integer num : list) {
            if (num % 2 == 0) list.remove(num);
        }
        System.out.println(list);
    }
}
// Что произойдёт? Почему ConcurrentModificationException возможна?