package org.example.streams;

import java.util.List;
import java.util.Optional;

public class MostFrequentWord {

    /**
     * Задача: Найти наиболее часто встречающееся слово
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк
     * и возвращает слово, которое встречается чаще всего. Использовать Stream API.
     * Если список пуст — вернуть Optional.empty().
     * <p>
     * Примеры:
     * mostFrequent(["a", "b", "a", "c", "a", "b"]) → Optional["a"]
     * mostFrequent(["x", "y", "y", "x", "y"])     → Optional["y"]
     * mostFrequent([])                           → Optional.empty
     */

    // TODO: реализуй метод ниже
    public static Optional<String> mostFrequent(List<String> list) {
        // реализация здесь
        return Optional.empty();
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(mostFrequent(List.of("a", "b", "a", "c", "a", "b"))); // Optional[a]
        System.out.println(mostFrequent(List.of("x", "y", "y", "x", "y")));     // Optional[y]
        System.out.println(mostFrequent(List.of()));                            // Optional.empty
    }
}
