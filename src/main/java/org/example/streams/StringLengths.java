package org.example.streams;

import java.util.List;

public class StringLengths {

    /**
     * Задача: Преобразовать список строк в список их длин
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк
     * и возвращает список длины каждой строки, используя Stream API.
     * <p>
     * Примеры:
     * stringLengths(["a", "ab", "abc"]) → [1, 2, 3]
     * stringLengths(["", "hello", " "]) → [0, 5, 1]
     */

    // TODO: реализуй метод ниже
    public static List<Integer> stringLengths(List<String> list) {
        // реализация здесь
        return List.of();
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(stringLengths(List.of("a", "ab", "abc")));     // [1, 2, 3]
        System.out.println(stringLengths(List.of("", "hello", " ")));    // [0, 5, 1]
    }
}
