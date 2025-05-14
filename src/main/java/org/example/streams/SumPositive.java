package org.example.streams;

import java.util.List;

public class SumPositive {

    /**
     * Задача: Найти сумму всех положительных чисел
     * <p>
     * Условие:
     * Напиши метод, который принимает список целых чисел
     * и возвращает сумму только положительных значений с использованием Stream API.
     * <p>
     * Примеры:
     * sumPositive([1, -2, 3, 4]) → 8
     * sumPositive([-1, -2, -3]) → 0
     * sumPositive([]) → 0
     */

    // TODO: реализуй метод ниже
    public static int sumPositive(List<Integer> list) {
        // реализация здесь
        return 0;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(sumPositive(List.of(1, -2, 3, 4))); // 8
        System.out.println(sumPositive(List.of(-1, -2, -3)));  // 0
        System.out.println(sumPositive(List.of()));            // 0
    }
}
