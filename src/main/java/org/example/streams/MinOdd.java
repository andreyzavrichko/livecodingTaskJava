package org.example.streams;

import java.util.List;
import java.util.Optional;

public class MinOdd {

    /**
     * Задача: Найти наименьшее нечётное число
     * <p>
     * Условие:
     * Напиши метод, который принимает список целых чисел
     * и возвращает минимальное нечётное число. Если нечётных нет — Optional.empty().
     * <p>
     * Примеры:
     * minOdd([4, 2, 7, 9]) → Optional[7]
     * minOdd([2, 4, 6])    → Optional.empty
     * minOdd([])           → Optional.empty
     */

    // TODO: реализуй метод ниже
    public static Optional<Integer> minOdd(List<Integer> list) {
        // реализация здесь
        return Optional.empty();
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(minOdd(List.of(4, 2, 7, 9))); // Optional[7]
        System.out.println(minOdd(List.of(2, 4, 6)));    // Optional.empty
        System.out.println(minOdd(List.of()));           // Optional.empty
    }
}
