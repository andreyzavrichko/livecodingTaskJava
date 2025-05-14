package org.example.collections;

import java.util.List;

public class CountEvenNumbers {

    /**
     * Задача: Подсчёт количества чётных чисел
     *
     * Условие:
     * Напиши метод, который принимает список целых чисел и возвращает
     * количество чётных чисел в нём.
     *
     * Примеры:
     * countEvenNumbers(List.of(1, 2, 3, 4, 5, 6)) → 3
     * countEvenNumbers(List.of(2, 4, 6, 8))       → 4
     * countEvenNumbers(List.of(1, 3, 5))          → 0
     */

    // TODO: реализуй метод ниже
    public static int countEvenNumbers(List<Integer> list) {
        // реализация здесь
        return 0;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(countEvenNumbers(List.of(1, 2, 3, 4, 5, 6))); // 3
        System.out.println(countEvenNumbers(List.of(2, 4, 6, 8)));       // 4
        System.out.println(countEvenNumbers(List.of(1, 3, 5)));          // 0
    }
}
