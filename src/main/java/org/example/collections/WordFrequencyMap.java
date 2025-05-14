package org.example.collections;

import java.util.Map;

public class WordFrequencyMap {

    /**
     * Задача: Подсчёт слов в строке
     * <p>
     * Условие:
     * Напиши метод, который принимает строку и возвращает Map<String, Integer>,
     * где каждому слову сопоставлено количество его вхождений.
     * Слова разделяются пробелами. Регистр важен.
     * <p>
     * Примеры:
     * wordFrequency("hello world hello") → {hello=2, world=1}
     * wordFrequency("Java Java java")   → {Java=2, java=1}
     * wordFrequency("")                 → {}
     */

    // TODO: реализуй метод ниже
    public static Map<String, Integer> wordFrequency(String str) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(wordFrequency("hello world hello")); // {hello=2, world=1}
        System.out.println(wordFrequency("Java Java java"));    // {Java=2, java=1}
        System.out.println(wordFrequency(""));                  // {}
    }
}
