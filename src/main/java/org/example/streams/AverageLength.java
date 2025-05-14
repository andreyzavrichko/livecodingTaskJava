package org.example.streams;

import java.util.List;

public class AverageLength {

    /**
     * Задача: Найти среднюю длину слов
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и возвращает
     * среднюю длину слова как double, используя Stream API.
     * Если список пуст — вернуть 0.0.
     * <p>
     * Примеры:
     * averageLength(["a", "ab", "abc"]) → 2.0
     * averageLength(["", "abcd", "ef"]) → 2.0
     * averageLength([])                → 0.0
     */

    // TODO: реализуй метод ниже
    public static double averageLength(List<String> list) {
        // реализация здесь
        return 0.0;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(averageLength(List.of("a", "ab", "abc")));     // 2.0
        System.out.println(averageLength(List.of("", "abcd", "ef")));    // 2.0
        System.out.println(averageLength(List.of()));                    // 0.0
    }
}
