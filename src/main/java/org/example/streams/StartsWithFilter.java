package org.example.streams;

import java.util.List;

public class StartsWithFilter {

    /**
     * Задача: Получить список слов, начинающихся с заданной буквы
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и символ `prefix`,
     * и возвращает список строк, начинающихся с этого символа. Использовать Stream API.
     * <p>
     * Примеры:
     * startsWith(["apple", "banana", "avocado"], 'a') → ["apple", "avocado"]
     * startsWith(["dog", "cat", "cow"], 'c') → ["cat", "cow"]
     * startsWith([], 'x') → []
     */

    // TODO: реализуй метод ниже
    public static List<String> startsWith(List<String> list, char c) {
        // реализация здесь
        return List.of();
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(startsWith(List.of("apple", "banana", "avocado"), 'a')); // [apple, avocado]
        System.out.println(startsWith(List.of("dog", "cat", "cow"), 'c'));          // [cat, cow]
        System.out.println(startsWith(List.of(), 'x'));                             // []
    }
}
