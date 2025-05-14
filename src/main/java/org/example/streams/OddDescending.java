package org.example.streams;

import java.util.List;

public class OddDescending {

    /**
     * Задача: Получить список нечётных чисел в обратном порядке
     * <p>
     * Условие:
     * Напиши метод, который принимает список целых чисел
     * и возвращает список нечётных чисел, отсортированных по убыванию. Использовать Stream API.
     * <p>
     * Примеры:
     * oddDescending([1, 2, 3, 4, 5]) → [5, 3, 1]
     * oddDescending([8, 6, 4])      → []
     * oddDescending([])            → []
     */

    // TODO: реализуй метод ниже
    public static List<Integer> oddDescending(List<Integer> list) {
        // реализация здесь
        return List.of();
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(oddDescending(List.of(1, 2, 3, 4, 5))); // [5, 3, 1]
        System.out.println(oddDescending(List.of(8, 6, 4)));       // []
        System.out.println(oddDescending(List.of()));              // []
    }
}
