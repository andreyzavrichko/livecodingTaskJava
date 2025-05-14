package org.example.streams;

import java.util.List;

public class SquareNumbers {

    /**
     * Задача: Получить список квадратов чисел
     * <p>
     * Условие:
     * Напиши метод, который принимает список целых чисел
     * и возвращает список их квадратов, используя Stream API.
     * <p>
     * Примеры:
     * squareNumbers([1, 2, 3]) → [1, 4, 9]
     * squareNumbers([-2, 0, 4]) → [4, 0, 16]
     * squareNumbers([]) → []
     */

    // TODO: реализуй метод ниже
    public static List<Integer> squareNumbers(List<Integer> list) {
        // реализация здесь
        return List.of();
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(squareNumbers(List.of(1, 2, 3)));       // [1, 4, 9]
        System.out.println(squareNumbers(List.of(-2, 0, 4)));      // [4, 0, 16]
        System.out.println(squareNumbers(List.of()));              // []
    }
}
