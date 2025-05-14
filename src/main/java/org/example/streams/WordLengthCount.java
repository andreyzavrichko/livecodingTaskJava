package org.example.streams;

import java.util.List;
import java.util.Map;

/**
 * Задача: Получить Map длины → количество слов
 * <p>
 * Условие:
 * Напиши метод, который принимает список строк и возвращает Map<Integer, Long>,
 * где ключ — длина строки, а значение — количество слов такой длины. Использовать Stream API.
 * <p>
 * Примеры:
 * ["a", "ab", "abc", "de"] → {1=1, 2=2, 3=1}
 * ["", "a", "ab", "ab"] → {0=1, 1=1, 2=2}
 * [] → {}
 */
public class WordLengthCount {

    // TODO: реализуй метод ниже
    public static Map<Integer, Long> wordLengthCount(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        System.out.println(wordLengthCount(List.of("a", "ab", "abc", "de"))); // → {1=1, 2=2, 3=1}
        System.out.println(wordLengthCount(List.of("", "a", "ab", "ab")));    // → {0=1, 1=1, 2=2}
        System.out.println(wordLengthCount(List.of()));                      // → {}
    }
}
