package org.example.streams;

import java.util.List;

/**
 * Задача: Удалить дубликаты и отсортировать
 * <p>
 * Условие:
 * Напиши метод, который принимает список строк,
 * удаляет дубликаты и возвращает отсортированный список, используя Stream API.
 * <p>
 * Примеры:
 * uniqueSorted(["b", "a", "b", "c"]) → ["a", "b", "c"]
 * uniqueSorted(["z", "x", "z", "x"]) → ["x", "z"]
 * uniqueSorted([])                  → []
 */
public class UniqueSorted {

    // TODO: реализуй метод ниже
    public static List<String> uniqueSorted(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(uniqueSorted(List.of("b", "a", "b", "c"))); // → [a, b, c]
        System.out.println(uniqueSorted(List.of("z", "x", "z", "x"))); // → [x, z]
        System.out.println(uniqueSorted(List.of()));                  // → []
    }
}
