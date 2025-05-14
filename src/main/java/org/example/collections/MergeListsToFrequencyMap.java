package org.example.collections;

import java.util.List;
import java.util.Map;

public class MergeListsToFrequencyMap {

    /**
     * Задача: Объединение списков с подсчётом частот
     * <p>
     * Условие:
     * Напиши метод, который принимает два списка строк и возвращает Map<String, Integer>,
     * где ключ — это слово, а значение — общее количество его вхождений в обоих списках.
     * <p>
     * Примеры:
     * mergeToFrequency(["a", "b", "a"], ["b", "c"]) → {a=2, b=2, c=1}
     * mergeToFrequency(["x"], ["x", "x", "y"])      → {x=3, y=1}
     * mergeToFrequency([], [])                     → {}
     */

    // TODO: реализуй метод ниже
    public static Map<String, Integer> mergeToFrequency(List<String> list1, List<String> list2) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(mergeToFrequency(List.of("a", "b", "a"), List.of("b", "c"))); // {a=2, b=2, c=1}
        System.out.println(mergeToFrequency(List.of("x"), List.of("x", "x", "y")));      // {x=3, y=1}
        System.out.println(mergeToFrequency(List.of(), List.of()));                     // {}
    }
}
