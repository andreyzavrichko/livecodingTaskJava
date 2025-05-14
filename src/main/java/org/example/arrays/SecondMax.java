package org.example.arrays;

public class SecondMax {

    /**
     * Задача: Найти второй по величине элемент массива
     *
     * Условие:
     * Напиши метод, который принимает массив целых чисел
     * и возвращает второй по величине (второй максимум) элемент.
     * Если такого нет (например, все элементы равны) — верни Integer.MIN_VALUE.
     *
     * Примеры:
     * secondMax(new int[]{4, 1, 7, 3, 9}) → 7
     * secondMax(new int[]{5, 5, 5})      → Integer.MIN_VALUE
     */

    // TODO: реализуй метод ниже
    public static int secondMax(int[] arr) {
        // реализация здесь
        return 0;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(secondMax(new int[]{4, 1, 7, 3, 9})); // 7
        System.out.println(secondMax(new int[]{5, 5, 5}));       // Integer.MIN_VALUE
    }
}
