package org.example.streams;

import java.util.List;

public class OnlyLetters {

    /**
     * Задача: Отфильтровать строки, содержащие только буквы
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и возвращает
     * только те, которые содержат только буквы (A-Z, a-z, без пробелов, цифр и символов). Использовать Stream API.
     * <p>
     * Примеры:
     * onlyLetters(["abc", "123", "a1b2", "Hello"]) → ["abc", "Hello"]
     * onlyLetters(["!", "space ", "word"])        → ["word"]
     * onlyLetters([])                             → []
     */

    // TODO: реализуй метод ниже
    public static List<String> onlyLetters(List<String> list) {
        // реализация здесь
        return List.of();
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(onlyLetters(List.of("abc", "123", "a1b2", "Hello"))); // ["abc", "Hello"]
        System.out.println(onlyLetters(List.of("!", "space ", "word")));         // ["word"]
        System.out.println(onlyLetters(List.of()));                              // []
    }
}
