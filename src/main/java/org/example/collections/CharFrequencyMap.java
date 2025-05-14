package org.example.collections;

import java.util.Map;

public class CharFrequencyMap {

    /**
     * Задача: Подсчёт частоты символов
     * <p>
     * Условие:
     * Напиши метод, который принимает строку и возвращает Map<Character, Integer>,
     * где каждому символу сопоставлено количество его вхождений.
     * <p>
     * Примеры:
     * charFrequency("hello")   → {h=1, e=1, l=2, o=1}
     * charFrequency("aabbcc")  → {a=2, b=2, c=2}
     * charFrequency("")        → {}
     */

    // TODO: реализуй метод ниже
    public static Map<Character, Integer> charFrequency(String str) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(charFrequency("hello"));   // {h=1, e=1, l=2, o=1}
        System.out.println(charFrequency("aabbcc"));  // {a=2, b=2, c=2}
        System.out.println(charFrequency(""));        // {}
    }
}
