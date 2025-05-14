package org.example.streams;

import java.util.List;

public class CountLongerThan {

    /**
     * Задача: Посчитать количество строк длиной более N
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и число N,
     * и возвращает количество строк, длина которых больше N. Использовать Stream API.
     * <p>
     * Примеры:
     * countLongerThan(["a", "abc", "abcd"], 2) → 2
     * countLongerThan(["", "a", "ab"], 1)      → 1
     * countLongerThan([], 3)                   → 0
     */

    // TODO: реализуй метод ниже
    public static int countLongerThan(List<String> list, int n) {
        // реализация здесь
        return 0;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(countLongerThan(List.of("a", "abc", "abcd"), 2)); // 2
        System.out.println(countLongerThan(List.of("", "a", "ab"), 1));      // 1
        System.out.println(countLongerThan(List.of(), 3));                   // 0
    }
}
