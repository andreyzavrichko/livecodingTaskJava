package org.example.collections;

import java.util.List;

public class MaxValue {

    /**
     * Задача: Поиск наибольшего элемента
     * <p>
     * Условие:
     * Напиши метод, который принимает список целых чисел и возвращает
     * максимальное значение. Если список пуст или null — вернуть null.
     * <p>
     * Примеры:
     * maxValue(List.of(1, 5, 3, 9, 2))     → 9
     * maxValue(List.of(-10, -5, -1))       → -1
     * maxValue(List.of())                 → null
     */

    // TODO: реализуй метод ниже
    public static Integer maxValue(List<Integer> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(maxValue(List.of(1, 5, 3, 9, 2)));     // 9
        System.out.println(maxValue(List.of(-10, -5, -1)));       // -1
        System.out.println(maxValue(List.of()));                  // null
    }
}
