package org.example.collections;

import java.util.List;

public class MergeUnique {

    /**
     * Задача: Объединение двух списков без дубликатов
     * <p>
     * Условие:
     * Напиши метод, который принимает два списка строк и возвращает новый список,
     * содержащий все уникальные элементы из обоих списков в порядке их первого появления.
     * <p>
     * Примеры:
     * mergeUnique(["a", "b", "c"], ["b", "c", "d"]) → ["a", "b", "c", "d"]
     * mergeUnique(["x"], ["x", "y", "z"])           → ["x", "y", "z"]
     * mergeUnique([], ["a", "b"])                   → ["a", "b"]
     */

    // TODO: реализуй метод ниже
    public static List<String> mergeUnique(List<String> list1, List<String> list2) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(mergeUnique(List.of("a", "b", "c"), List.of("b", "c", "d"))); // [a, b, c, d]
        System.out.println(mergeUnique(List.of("x"), List.of("x", "y", "z")));           // [x, y, z]
        System.out.println(mergeUnique(List.of(), List.of("a", "b")));                  // [a, b]
    }
}
