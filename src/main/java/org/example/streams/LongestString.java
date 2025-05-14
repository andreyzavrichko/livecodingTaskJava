package org.example.streams;

import java.util.List;
import java.util.Optional;

public class LongestString {

    /**
     * Задача: Найти строку с максимальной длиной
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк
     * и возвращает строку с максимальной длиной. Использовать Stream API.
     * Если список пуст — вернуть Optional.empty().
     * <p>
     * Примеры:
     * longestString(["a", "abc", "ab"])       → Optional["abc"]
     * longestString(["one", "two", "three"]) → Optional["three"]
     * longestString([])                      → Optional.empty
     */

    // TODO: реализуй метод ниже
    public static Optional<String> longestString(List<String> list) {
        // реализация здесь
        return Optional.empty();
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(longestString(List.of("a", "abc", "ab")));       // Optional[abc]
        System.out.println(longestString(List.of("one", "two", "three"))); // Optional[three]
        System.out.println(longestString(List.of()));                      // Optional.empty
    }
}
