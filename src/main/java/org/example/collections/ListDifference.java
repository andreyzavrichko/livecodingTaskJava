package org.example.collections;

import java.util.List;
import java.util.Set;

public class ListDifference {

    /**
     * Задача: Разность двух списков
     * <p>
     * Условие:
     * Напиши метод, который возвращает Set<String>,
     * содержащий только те элементы из первого списка, которых нет во втором.
     * <p>
     * Примеры:
     * difference(List.of("a", "b", "c"), List.of("b", "c", "d")) → ["a"]
     * difference(List.of("x", "y"), List.of("y"))                → ["x"]
     * difference(List.of("one"), List.of())                      → ["one"]
     */

    // TODO: реализуй метод ниже
    public static Set<String> difference(List<String> list1, List<String> list2) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(difference(List.of("a", "b", "c"), List.of("b", "c", "d"))); // [a]
        System.out.println(difference(List.of("x", "y"), List.of("y")));                // [x]
        System.out.println(difference(List.of("one"), List.of()));                      // [one]
    }
}
