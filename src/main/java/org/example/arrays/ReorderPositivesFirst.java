package org.example.arrays;

import java.util.Arrays;

public class ReorderPositivesFirst {

    /**
     * Задача: Переставить положительные элементы в начало массива (порядок важен)
     *
     * Условие:
     * Напиши метод, который возвращает новый массив, где все положительные элементы
     * идут в начале, а все остальные — после них. При этом относительный порядок сохраняется.
     *
     * Примеры:
     * reorderPositivesFirst(new int[]{0, -1, 3, 2, -5, 4}) → [3, 2, 4, 0, -1, -5]
     * reorderPositivesFirst(new int[]{-2, -1, 0})          → [-2, -1, 0]
     */

    // TODO: реализуй метод ниже
    public static int[] reorderPositivesFirst(int[] arr) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(Arrays.toString(reorderPositivesFirst(new int[]{0, -1, 3, 2, -5, 4}))); // [3, 2, 4, 0, -1, -5]
        System.out.println(Arrays.toString(reorderPositivesFirst(new int[]{-2, -1, 0})));          // [-2, -1, 0]
    }
}
