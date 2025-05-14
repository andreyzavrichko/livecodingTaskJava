package org.example.streams;

import java.util.List;
import java.util.Map;

public class ToLengthMap {

    /**
     * Задача: Преобразовать список строк в Map: строка → её длина
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и возвращает Map<String, Integer>,
     * где ключ — это сама строка, а значение — её длина. Использовать Stream API.
     * <p>
     * Примеры:
     * toLengthMap(["a", "ab", "abc"]) → {"a"=1, "ab"=2, "abc"=3}
     * toLengthMap(["", "hello"]) → {"", 0, "hello"=5}
     * toLengthMap([]) → {}
     */

    // TODO: реализуй метод ниже
    public static Map<String, Integer> toLengthMap(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(toLengthMap(List.of("a", "ab", "abc")));       // {"a"=1, "ab"=2, "abc"=3}
        System.out.println(toLengthMap(List.of("", "hello")));            // {"", 0, "hello"=5}
        System.out.println(toLengthMap(List.of()));                       // {}
    }
}
