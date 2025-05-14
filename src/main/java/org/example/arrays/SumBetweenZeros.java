package org.example.arrays;

public class SumBetweenZeros {

    /**
     * Задача: Сумма элементов между двумя нулями
     *
     * Условие:
     * Напиши метод, который возвращает сумму всех элементов массива,
     * находящихся между первым и последним нулём (не включая нули).
     * Если двух нулей нет — верни 0.
     *
     * Примеры:
     * sumBetweenZeros(new int[]{5, 0, 2, 3, 0, 7}) → 5
     * sumBetweenZeros(new int[]{0, 1, 2, 0})       → 3
     * sumBetweenZeros(new int[]{1, 2, 3})          → 0
     */

    // TODO: реализуй метод ниже
    public static int sumBetweenZeros(int[] arr) {
        // реализация здесь
        return 0;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(sumBetweenZeros(new int[]{5, 0, 2, 3, 0, 7})); // 5
        System.out.println(sumBetweenZeros(new int[]{0, 1, 2, 0}));       // 3
        System.out.println(sumBetweenZeros(new int[]{1, 2, 3}));          // 0
    }
}