package org.example.streams;

import java.util.List;

public class ContainsLengthN {

    /**
     * Задача: Проверить, есть ли строка длиной ровно N
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и число N,
     * и возвращает true, если хотя бы одна строка имеет длину ровно N. Использовать Stream API.
     * <p>
     * Примеры:
     * containsLengthN(["a", "abc", "de"], 2) → true
     * containsLengthN(["x", "y", "z"], 5)    → false
     * containsLengthN([], 3)                → false
     */

    // TODO: реализуй метод ниже
    public static boolean containsLengthN(List<String> list, int n) {
        // реализация здесь
        return false;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(containsLengthN(List.of("a", "abc", "de"), 2)); // true
        System.out.println(containsLengthN(List.of("x", "y", "z"), 5));     // false
        System.out.println(containsLengthN(List.of(), 3));                 // false
    }
}
