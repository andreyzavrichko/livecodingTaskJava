package org.example.arrays;

public class CountLocalMaxima {

    /**
     * Задача: Подсчёт количества локальных максимумов
     *
     * Условие:
     * Напиши метод, который считает количество локальных максимумов в массиве.
     * Локальный максимум — это элемент, который больше своих соседей.
     * Первый и последний элементы не учитываются.
     *
     * Пример:
     * countLocalMaxima(new int[]{1, 3, 2, 4, 3}) → 2 (локальные максимумы: 3 и 4)
     */

    // TODO: реализуй метод ниже
    public static int countLocalMaxima(int[] arr) {
        // реализация здесь
        return 0;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(countLocalMaxima(new int[]{1, 3, 2, 4, 3})); // 2
        System.out.println(countLocalMaxima(new int[]{1, 2, 3, 2, 1})); // 1
        System.out.println(countLocalMaxima(new int[]{5, 1, 5, 1, 5})); // 2
    }
}
