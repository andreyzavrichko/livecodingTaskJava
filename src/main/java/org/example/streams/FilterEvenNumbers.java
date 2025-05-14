package org.example.streams;

import java.util.List;

public class FilterEvenNumbers {

    /**
     * Задача: Отфильтровать чётные числа
     * <p>
     * Условие:
     * Напиши метод, который принимает список целых чисел
     * и возвращает список только чётных чисел с использованием Stream API.
     * <p>
     * Примеры:
     * filterEvenNumbers([1, 2, 3, 4, 5, 6]) → [2, 4, 6]
     * filterEvenNumbers([7, 8, 9])         → [8]
     * filterEvenNumbers([])               → []
     */

    // TODO: реализуй метод ниже
    public static List<Integer> filterEvenNumbers(List<Integer> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(filterEvenNumbers(List.of(1, 2, 3, 4, 5, 6))); // [2, 4, 6]
        System.out.println(filterEvenNumbers(List.of(7, 8, 9)));         // [8]
        System.out.println(filterEvenNumbers(List.of()));               // []
    }
}
