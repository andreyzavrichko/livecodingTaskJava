package org.example.collections;

import java.util.List;
import java.util.Map;

public class InvertMap {

    /**
     * Задача: Инверсия Map
     * <p>
     * Условие:
     * Напиши метод, который принимает Map<String, Integer> и возвращает Map<Integer, List<String>>,
     * где ключом становится значение из исходной Map, а значением — список всех ключей,
     * которые имели это значение.
     * <p>
     * Примеры:
     * invertMap({"a"=1, "b"=2, "c"=1}) → {1=[a, c], 2=[b]}
     * invertMap({"x"=5, "y"=5, "z"=6}) → {5=[x, y], 6=[z]}
     * invertMap({})                   → {}
     */

    // TODO: реализуй метод ниже
    public static Map<Integer, List<String>> invertMap(Map<String, Integer> map) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        Map<String, Integer> map1 = Map.of("a", 1, "b", 2, "c", 1);
        Map<String, Integer> map2 = Map.of("x", 5, "y", 5, "z", 6);

        System.out.println(invertMap(map1)); // {1=[a, c], 2=[b]}
        System.out.println(invertMap(map2)); // {5=[x, y], 6=[z]}
        System.out.println(invertMap(Map.of())); // {}
    }
}
