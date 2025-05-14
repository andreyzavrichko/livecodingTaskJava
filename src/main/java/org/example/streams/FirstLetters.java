package org.example.streams;

import java.util.List;

public class FirstLetters {

    /**
     * Задача: Получить строку из первых букв слов
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и возвращает строку,
     * составленную из первых букв каждого непустого слова. Использовать Stream API.
     * <p>
     * Примеры:
     * firstLetters(["hello", "world"])             → "hw"
     * firstLetters(["Java", "", "Stream", "API"])  → "JSA"
     * firstLetters([])                             → ""
     */

    // TODO: реализуй метод ниже
    public static String firstLetters(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(firstLetters(List.of("hello", "world")));             // "hw"
        System.out.println(firstLetters(List.of("Java", "", "Stream", "API")));  // "JSA"
        System.out.println(firstLetters(List.of()));                             // ""
    }
}
