package org.example.collections;

import java.util.List;

public class RemoveDuplicates {

    /**
     * Задача: Фильтрация дубликатов
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и возвращает новый список,
     * в котором удалены все повторяющиеся элементы. Порядок должен сохраняться.
     * <p>
     * Примеры:
     * removeDuplicates(["apple", "banana", "apple", "orange"]) → ["apple", "banana", "orange"]
     * removeDuplicates(["a", "b", "b", "a", "c"])               → ["a", "b", "c"]
     * removeDuplicates([])                                     → []
     */

    // TODO: реализуй метод ниже
    public static List<String> removeDuplicates(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(removeDuplicates(List.of("apple", "banana", "apple", "orange"))); // [apple, banana, orange]
        System.out.println(removeDuplicates(List.of("a", "b", "b", "a", "c")));               // [a, b, c]
        System.out.println(removeDuplicates(List.of()));                                     // []
    }
}
