package org.example.interviewcore;

import java.util.Arrays;
import java.util.List;

public class ArrayMutation {
    public static void main(String[] args) {
        String[] arr = {"one", "two", "three"};
        List<String> list = Arrays.asList(arr);
        list.set(0, "ONE");
        System.out.println(Arrays.toString(arr));
    }
}
// Что выведет программа? Почему?
