package org.example.collections;

import java.util.List;
import java.util.Set;

public class FindDuplicates {

    /**
     * Задача: Получить все элементы, которые встречаются более одного раза
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и возвращает Set<String>,
     * содержащий все элементы, которые встречаются более одного раза.
     * <p>
     * Примеры:
     * findDuplicates(List.of("a", "b", "a", "c", "b")) → ["a", "b"]
     * findDuplicates(List.of("one", "two", "three"))  → []
     * findDuplicates(List.of())                       → []
     */

    // TODO: реализуй метод ниже
    public static Set<String> findDuplicates(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(findDuplicates(List.of("a", "b", "a", "c", "b")));    // [a, b]
        System.out.println(findDuplicates(List.of("one", "two", "three")));     // []
        System.out.println(findDuplicates(List.of()));                           // []
    }
}
