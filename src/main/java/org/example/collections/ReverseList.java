package org.example.collections;

import java.util.List;

public class ReverseList {

    /**
     * Задача: Обратный порядок
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и возвращает
     * новый список в обратном порядке.
     * <p>
     * Примеры:
     * reverseList(["a", "b", "c"]) → ["c", "b", "a"]
     * reverseList(["one", "two"]) → ["two", "one"]
     * reverseList([])             → []
     */

    // TODO: реализуй метод ниже
    public static List<String> reverseList(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(reverseList(List.of("a", "b", "c")));   // [c, b, a]
        System.out.println(reverseList(List.of("one", "two")));    // [two, one]
        System.out.println(reverseList(List.of()));                // []
    }
}
