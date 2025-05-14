package org.example.collections;

import java.util.List;

public class SortByFrequency {

    /**
     * Задача: Сортировка по частоте
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и возвращает список,
     * отсортированный по возрастанию количества вхождений слов.
     * Если частоты равны — сохранить исходный порядок.
     * <p>
     * Примеры:
     * sortByFrequency(["a", "b", "a", "c", "b", "b"]) → ["c", "a", "a", "b", "b", "b"]
     * sortByFrequency(["x", "y", "x", "z", "z"])      → ["y", "x", "x", "z", "z"]
     * sortByFrequency(["one"])                       → ["one"]
     */

    // TODO: реализуй метод ниже
    public static List<String> sortByFrequency(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(sortByFrequency(List.of("a", "b", "a", "c", "b", "b"))); // [c, a, a, b, b, b]
        System.out.println(sortByFrequency(List.of("x", "y", "x", "z", "z")));      // [y, x, x, z, z]
        System.out.println(sortByFrequency(List.of("one")));                        // [one]
    }
}
