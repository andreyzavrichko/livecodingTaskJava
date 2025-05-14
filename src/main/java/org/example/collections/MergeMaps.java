package org.example.collections;

import java.util.Map;

public class MergeMaps {

    /**
     * Задача: Объединение Map'ов с суммированием значений
     * <p>
     * Условие:
     * Напиши метод, который принимает два Map<String, Integer>
     * и возвращает новый Map, в котором значения с одинаковыми ключами суммируются.
     * <p>
     * Примеры:
     * mergeMaps({"a"=1, "b"=2}, {"b"=3, "c"=4}) → {"a"=1, "b"=5, "c"=4}
     * mergeMaps({"x"=5}, {"x"=5, "y"=10})      → {"x"=10, "y"=10}
     * mergeMaps({}, {"a"=1})                   → {"a"=1}
     */

    // TODO: реализуй метод ниже
    public static Map<String, Integer> mergeMaps(Map<String, Integer> map1, Map<String, Integer> map2) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        Map<String, Integer> map1 = Map.of("a", 1, "b", 2);
        Map<String, Integer> map2 = Map.of("b", 3, "c", 4);
        System.out.println(mergeMaps(map1, map2)); // {a=1, b=5, c=4}

        map1 = Map.of("x", 5);
        map2 = Map.of("x", 5, "y", 10);
        System.out.println(mergeMaps(map1, map2)); // {x=10, y=10}

        map1 = Map.of();
        map2 = Map.of("a", 1);
        System.out.println(mergeMaps(map1, map2)); // {a=1}
    }
}
