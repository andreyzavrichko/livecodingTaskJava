package org.example.strings;

/**
 * Задача: Поиск самой длинной строки в массиве
 * <p>
 * Условие:
 * Напиши метод, который принимает массив строк и возвращает
 * самую длинную из них. Если таких несколько — вернуть первую.
 * Если массив пуст или null — вернуть null.
 * <p>
 * Примеры:
 * {"Java", "Automation", "QA"} → "Automation"
 * {"one", "three", "two"} → "three"
 * {} → null
 */
public class LongestString {

    // TODO: реализуй метод
    public static String longestString(String[] words) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(longestString(new String[]{"Java", "Automation", "QA"}));    // → "Automation"
        System.out.println(longestString(new String[]{"one", "three", "two"}));         // → "three"
        System.out.println(longestString(new String[]{}));                              // → null
    }
}
