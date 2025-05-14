package org.example.streams;

import java.util.List;

public class JoinWithComma {

    /**
     * Задача: Объединить строки через запятую
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и объединяет их в одну строку,
     * где элементы разделены запятой. Использовать Stream API.
     * <p>
     * Примеры:
     * joinWithComma(["a", "b", "c"])     → "a,b,c"
     * joinWithComma(["hello", "world"]) → "hello,world"
     * joinWithComma([])                 → ""
     */

    // TODO: реализуй метод ниже
    public static String joinWithComma(List<String> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(joinWithComma(List.of("a", "b", "c")));     // "a,b,c"
        System.out.println(joinWithComma(List.of("hello", "world"))); // "hello,world"
        System.out.println(joinWithComma(List.of()));                 // ""
    }
}
