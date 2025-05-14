package org.example.strings;

/**
 * Задача: Проверка, все ли символы в строке уникальны
 * <p>
 * Условие:
 * Напиши метод, который возвращает true, если в строке все символы уникальны.
 * Регистр имеет значение. Пробелы и символы тоже учитываются.
 * <p>
 * Примеры:
 * "abc" → true
 * "hello" → false
 * "Java!" → true
 */
public class IsUnique {

    // TODO: реализуй метод
    public static boolean isUnique(String str) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isUnique("abc"));    // → true
        System.out.println(isUnique("hello"));  // → false
        System.out.println(isUnique("Java!"));  // → true
    }
}
