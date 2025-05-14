package org.example.streams;

import java.util.Set;

/**
 * Задача: Собрать уникальные символы из строки
 * <p>
 * Условие:
 * Напиши метод, который принимает строку и возвращает Set<Character>,
 * содержащий все уникальные буквы, используя Stream API.
 * <p>
 * Примеры:
 * uniqueCharacters("hello")   → [h, e, l, o]
 * uniqueCharacters("abcabc") → [a, b, c]
 * uniqueCharacters("")       → []
 */
public class UniqueCharacters {

    // TODO: реализуй метод ниже
    public static Set<Character> uniqueCharacters(String str) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(uniqueCharacters("hello"));    // → [h, e, l, o]
        System.out.println(uniqueCharacters("abcabc"));   // → [a, b, c]
        System.out.println(uniqueCharacters(""));         // → []
    }
}
