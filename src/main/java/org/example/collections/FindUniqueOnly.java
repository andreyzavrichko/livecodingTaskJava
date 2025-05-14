package org.example.collections;

import java.util.List;
import java.util.Set;

public class FindUniqueOnly {

    /**
     * Задача: Найти элементы, встречающиеся только один раз
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и возвращает Set<String>,
     * содержащий только те элементы, которые встречаются в списке ровно один раз.
     * <p>
     * Примеры:
     * findUniques(List.of("a", "b", "a", "c", "b", "d")) → ["c", "d"]
     * findUniques(List.of("x", "y", "x", "z", "z"))      → ["y"]
     * findUniques(List.of("one", "two", "three"))        → ["one", "two", "three"]
     */

    // TODO: реализуй метод ниже
    public static Set<String> findUniques(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(findUniques(List.of("a", "b", "a", "c", "b", "d")));     // [c, d]
        System.out.println(findUniques(List.of("x", "y", "x", "z", "z")));         // [y]
        System.out.println(findUniques(List.of("one", "two", "three")));          // [one, two, three]
    }
}
