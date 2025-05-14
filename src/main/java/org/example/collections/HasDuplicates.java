package org.example.collections;

import java.util.List;

public class HasDuplicates {

    /**
     * Задача: Проверка, есть ли дубликаты
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и возвращает true,
     * если в списке есть хотя бы один повторяющийся элемент.
     * <p>
     * Примеры:
     * hasDuplicates(List.of("a", "b", "c")) → false
     * hasDuplicates(List.of("x", "y", "x")) → true
     * hasDuplicates(List.of())             → false
     */

    // TODO: реализуй метод ниже
    public static boolean hasDuplicates(List<String> list) {
        // реализация здесь
        return false;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(hasDuplicates(List.of("a", "b", "c"))); // false
        System.out.println(hasDuplicates(List.of("x", "y", "x"))); // true
        System.out.println(hasDuplicates(List.of()));              // false
    }
}
