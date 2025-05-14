package org.example.streams;

import java.util.List;

public class AllNonEmpty {

    /**
     * Задача: Проверка, все ли строки непустые
     *
     * Условие:
     * Напиши метод, который принимает список строк
     * и возвращает true, если все строки непустые (не равны "").
     * Использовать Stream API.
     *
     * Примеры:
     * allNonEmpty(["a", "b", "c"]) → true
     * allNonEmpty(["a", "", "b"]) → false
     * allNonEmpty([])             → true
     */

    // TODO: реализуй метод ниже
    public static boolean allNonEmpty(List<String> list) {
        // реализация здесь
        return false;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(allNonEmpty(List.of("a", "b", "c")));  // true
        System.out.println(allNonEmpty(List.of("a", "", "b")));   // false
        System.out.println(allNonEmpty(List.of()));               // true
    }
}
