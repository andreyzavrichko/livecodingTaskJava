package org.example.streams;

import java.util.List;

public class MultiplyByTwo {

    /**
     * Задача: Умножить все числа на 2
     * <p>
     * Условие:
     * Напиши метод, который принимает список целых чисел
     * и возвращает список, где каждое число умножено на 2, используя Stream API.
     * <p>
     * Примеры:
     * multiplyByTwo([1, 2, 3])    → [2, 4, 6]
     * multiplyByTwo([0, -1, 5])   → [0, -2, 10]
     * multiplyByTwo([])          → []
     */

    // TODO: реализуй метод ниже
    public static List<Integer> multiplyByTwo(List<Integer> list) {
        // реализация здесь
        return List.of();
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(multiplyByTwo(List.of(1, 2, 3)));    // [2, 4, 6]
        System.out.println(multiplyByTwo(List.of(0, -1, 5)));   // [0, -2, 10]
        System.out.println(multiplyByTwo(List.of()));           // []
    }
}
