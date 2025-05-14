package org.example.arrays;

public class LongestIncreasingStreak {

    /**
     * Задача: Сколько чисел идут подряд по возрастанию
     *
     * Условие:
     * Напиши метод, который возвращает длину самой длинной последовательности подряд идущих
     * возрастающих чисел в массиве.
     *
     * Примеры:
     * longestIncreasingStreak(new int[]{1, 2, 3, 2, 3, 4, 5}) → 4  // 2,3,4,5
     * longestIncreasingStreak(new int[]{5, 4, 3, 2, 1})       → 1
     * longestIncreasingStreak(new int[]{1, 3, 5, 4, 6, 8})    → 3  // 4,6,8
     */

    // TODO: реализуй метод ниже
    public static int longestIncreasingStreak(int[] arr) {
        // реализация здесь
        return 0;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(longestIncreasingStreak(new int[]{1, 2, 3, 2, 3, 4, 5})); // 4
        System.out.println(longestIncreasingStreak(new int[]{5, 4, 3, 2, 1}));       // 1
        System.out.println(longestIncreasingStreak(new int[]{1, 3, 5, 4, 6, 8}));    // 3
    }
}
