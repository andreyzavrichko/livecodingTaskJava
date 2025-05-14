package org.example.streams;

import java.util.List;
import java.util.Map;

public class GroupByLength {

    /**
     * Задача: Преобразовать в Map длины → список слов
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк
     * и возвращает Map<Integer, List<String>>, где ключ — длина строки, а значение — все строки такой длины.
     * Использовать Stream API и Collectors.groupingBy().
     * <p>
     * Примеры:
     * groupByLength(["a", "bb", "ccc", "dd", "e"]) → {1=[a, e], 2=[bb, dd], 3=[ccc]}
     * groupByLength([])                           → {}
     */

    // TODO: реализуй метод ниже
    public static Map<Integer, List<String>> groupByLength(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(groupByLength(List.of("a", "bb", "ccc", "dd", "e"))); // {1=[a, e], 2=[bb, dd], 3=[ccc]}
        System.out.println(groupByLength(List.of()));                            // {}
    }
}
