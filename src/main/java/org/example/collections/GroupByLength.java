package org.example.collections;

import java.util.List;
import java.util.Map;

public class GroupByLength {

    /**
     * Задача: Группировка по длине строки
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и группирует их по длине.
     * Верни Map<Integer, List<String>>, где ключ — длина строки, а значение — список строк этой длины.
     * <p>
     * Примеры:
     * groupByLength(List.of("one", "two", "three", "four")) → {3=[one, two], 5=[three], 4=[four]}
     * groupByLength(List.of("a", "bb", "ccc", "dd", "e"))   → {1=[a, e], 2=[bb, dd], 3=[ccc]}
     * groupByLength(List.of())                              → {}
     */

    // TODO: реализуй метод ниже
    public static Map<Integer, List<String>> groupByLength(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(groupByLength(List.of("one", "two", "three", "four"))); // {3=[one, two], 5=[three], 4=[four]}
        System.out.println(groupByLength(List.of("a", "bb", "ccc", "dd", "e")));   // {1=[a, e], 2=[bb, dd], 3=[ccc]}
        System.out.println(groupByLength(List.of()));                              // {}
    }
}
