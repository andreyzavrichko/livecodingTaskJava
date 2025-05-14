package org.example.collections;

import java.util.List;

public class SecondMaxValue {

    /**
     * Задача: Поиск второго по величине элемента
     * <p>
     * Условие:
     * Напиши метод, который возвращает второй по величине элемент из списка целых чисел.
     * Если такого нет (меньше двух уникальных значений) — вернуть null.
     * <p>
     * Примеры:
     * secondMaxValue([1, 5, 3, 9, 2]) → 5
     * secondMaxValue([10, 10, 9])    → 9
     * secondMaxValue([7])            → null
     */

    // TODO: реализуй метод ниже
    public static Integer secondMaxValue(List<Integer> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(secondMaxValue(List.of(1, 5, 3, 9, 2))); // 5
        System.out.println(secondMaxValue(List.of(10, 10, 9)));     // 9
        System.out.println(secondMaxValue(List.of(7)));             // null
    }
}
