package org.example.arrays;

import java.util.Arrays;

public class ReverseArray {

    /**
     * Задача: Развернуть массив
     *
     * Условие:
     * Напиши метод, который принимает массив целых чисел
     * и разворачивает его (меняет порядок элементов на обратный).
     *
     * Примеры:
     * reverse(new int[]{1, 2, 3, 4}) → [4, 3, 2, 1]
     * reverse(new int[]{7, 8})      → [8, 7]
     */

    // TODO: реализуй метод ниже
    public static void reverse(int[] arr) {
        // реализация здесь
    }

    public static void main(String[] args) {
        // Примеры для запуска
        int[] arr1 = {1, 2, 3, 4};
        reverse(arr1);
        System.out.println(Arrays.toString(arr1)); // [4, 3, 2, 1]

        int[] arr2 = {7, 8};
        reverse(arr2);
        System.out.println(Arrays.toString(arr2)); // [8, 7]
    }
}
