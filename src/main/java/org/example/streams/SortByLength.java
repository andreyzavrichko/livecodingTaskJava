package org.example.streams;

import java.util.List;

public class SortByLength {

    /**
     * Задача: Отсортировать строки по длине
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк
     * и возвращает новый список, отсортированный по возрастанию длины строки. Использовать Stream API.
     * <p>
     * Примеры:
     * sortByLength(["a", "abc", "ab"]) → ["a", "ab", "abc"]
     * sortByLength(["hello", "", "hi"]) → ["", "hi", "hello"]
     * sortByLength([]) → []
     */

    // TODO: реализуй метод ниже
    public static List<String> sortByLength(List<String> list) {
        // реализация здесь
        return List.of();
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(sortByLength(List.of("a", "abc", "ab")));         // ["a", "ab", "abc"]
        System.out.println(sortByLength(List.of("hello", "", "hi")));       // ["", "hi", "hello"]
        System.out.println(sortByLength(List.of()));                        // []
    }
}
