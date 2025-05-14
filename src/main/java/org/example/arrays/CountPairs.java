package org.example.arrays;

public class CountPairs {

    /**
     * Задача: Подсчитать количество пар одинаковых элементов
     *
     * Условие:
     * Напиши метод, который возвращает количество пар одинаковых элементов в массиве.
     * Пара — это две одинаковые цифры. Повторные пары учитываются кратно (например, 4 одинаковых элемента дают 2 пары).
     *
     * Примеры:
     * countPairs(new int[]{1, 2, 2, 3, 3, 3}) → 2  // (2,2) и (3,3)
     * countPairs(new int[]{1, 1, 1, 1})       → 2  // две пары из 1
     */

    // TODO: реализуй метод ниже
    public static int countPairs(int[] arr) {
        // реализация здесь
        return 0;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(countPairs(new int[]{1, 2, 2, 3, 3, 3})); // 2
        System.out.println(countPairs(new int[]{1, 1, 1, 1}));       // 2
    }
}
