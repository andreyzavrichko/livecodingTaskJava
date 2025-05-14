package org.example.streams;

import java.util.List;

/**
 * Задача: Получить список строк в верхнем регистре
 * <p>
 * Условие:
 * Напиши метод, который принимает список строк
 * и возвращает новый список, где все строки приведены к верхнему регистру. Использовать Stream API.
 * <p>
 * Примеры:
 * toUppercase(["a", "b", "c"]) → ["A", "B", "C"]
 * toUppercase(["hello", "World"]) → ["HELLO", "WORLD"]
 * toUppercase([]) → []
 */
public class ToUppercaseList {

    // TODO: реализуй метод ниже
    public static List<String> toUppercase(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(toUppercase(List.of("a", "b", "c")));            // → ["A", "B", "C"]
        System.out.println(toUppercase(List.of("hello", "World")));        // → ["HELLO", "WORLD"]
        System.out.println(toUppercase(List.of()));                        // → []
    }
}
