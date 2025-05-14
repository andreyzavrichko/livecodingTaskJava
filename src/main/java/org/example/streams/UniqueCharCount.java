package org.example.streams;

import java.util.List;

/**
 * Задача: Найти количество уникальных символов в списке строк
 * <p>
 * Условие:
 * Напиши метод, который принимает список строк и возвращает количество уникальных символов
 * (всех символов, без учёта регистра), используя Stream API.
 * <p>
 * Примеры:
 * uniqueCharCount(["abc", "aBC", "123"]) → 6
 * uniqueCharCount(["", " "])            → 1
 * uniqueCharCount([])                   → 0
 */
public class UniqueCharCount {

    // TODO: реализуй метод ниже
    public static int uniqueCharCount(List<String> list) {
        // реализация здесь
        return 0;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(uniqueCharCount(List.of("abc", "aBC", "123")));  // → 6
        System.out.println(uniqueCharCount(List.of("", " ")));             // → 1
        System.out.println(uniqueCharCount(List.of()));                    // → 0
    }
}
