package org.example.streams;

import java.util.List;
import java.util.Optional;

public class MaxValue {

    /**
     * Задача: Найти максимальное значение
     * <p>
     * Условие:
     * Напиши метод, который принимает список целых чисел
     * и возвращает максимальное значение как Optional<Integer>, используя Stream API.
     * <p>
     * Примеры:
     * maxValue([1, 3, 2])       → Optional[3]
     * maxValue([-5, -2, -10])   → Optional[-2]
     * maxValue([])              → Optional.empty
     */

    // TODO: реализуй метод ниже
    public static Optional<Integer> maxValue(List<Integer> list) {
        // реализация здесь
        return Optional.empty();
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(maxValue(List.of(1, 3, 2)));       // Optional[3]
        System.out.println(maxValue(List.of(-5, -2, -10)));   // Optional[-2]
        System.out.println(maxValue(List.of()));              // Optional.empty
    }
}
