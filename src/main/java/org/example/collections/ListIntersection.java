package org.example.collections;

import java.util.List;
import java.util.Set;

public class ListIntersection {

    /**
     * Задача: Пересечение двух списков
     * <p>
     * Условие:
     * Напиши метод, который возвращает Set<String>, содержащий только те элементы,
     * которые есть в обоих списках.
     * <p>
     * Примеры:
     * intersection(List.of("a", "b", "c"), List.of("b", "c", "d")) → ["b", "c"]
     * intersection(List.of("x", "y"), List.of("a", "b"))           → []
     * intersection(List.of(), List.of("a"))                        → []
     */

    // TODO: реализуй метод ниже
    public static Set<String> intersection(List<String> list1, List<String> list2) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(intersection(List.of("a", "b", "c"), List.of("b", "c", "d"))); // [b, c]
        System.out.println(intersection(List.of("x", "y"), List.of("a", "b")));           // []
        System.out.println(intersection(List.of(), List.of("a")));                        // []
    }
}
