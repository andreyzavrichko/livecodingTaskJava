package org.example.streams;

import java.util.List;
import java.util.Map;

public class GroupByFirstChar {

    /**
     * Задача: Сгруппировать слова по первому символу
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и возвращает Map<Character, List<String>>,
     * где ключ — первый символ строки (в нижнем регистре), а значение — список всех слов, начинающихся на эту букву.
     * Пустые строки пропускать. Использовать Stream API.
     * <p>
     * Примеры:
     * groupByFirstChar(["apple", "banana", "apricot", "blueberry"]) → {a=[apple, apricot], b=[banana, blueberry]}
     * groupByFirstChar(["Dog", "cat", "Cow", "donkey"])             → {d=[Dog, donkey], c=[cat, Cow]}
     */

    // TODO: реализуй метод ниже
    public static Map<Character, List<String>> groupByFirstChar(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(groupByFirstChar(List.of("apple", "banana", "apricot", "blueberry")));
        System.out.println(groupByFirstChar(List.of("Dog", "cat", "Cow", "donkey")));
        System.out.println(groupByFirstChar(List.of()));
    }
}
