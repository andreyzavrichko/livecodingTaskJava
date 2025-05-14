package org.example.arrays;

public class MinPositive {

    /**
     * Задача: Найти наименьший положительный элемент массива
     *
     * Условие:
     * Напиши метод, который возвращает минимальный положительный элемент массива.
     * Если положительных чисел нет, верни Integer.MAX_VALUE.
     *
     * Примеры:
     * minPositive(new int[]{0, -1, 3, 7, -5}) → 3
     * minPositive(new int[]{-4, -3, 0})       → Integer.MAX_VALUE
     */

    // TODO: реализуй метод ниже
    public static int minPositive(int[] arr) {
        // реализация здесь
        return 0;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(minPositive(new int[]{0, -1, 3, 7, -5})); // 3
        System.out.println(minPositive(new int[]{-4, -3, 0}));       // Integer.MAX_VALUE
    }
}
