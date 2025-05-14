package org.example.strings;

/**
 * Задача: Проверка анаграммы
 * <p>
 * Условие:
 * Напиши метод, который проверяет, являются ли две строки анаграммами.
 * Анаграммы — это строки, содержащие одинаковые символы с одинаковой частотой,
 * но возможно в разном порядке.
 * Регистр символов имеет значение. Пробелы учитывать.
 * <p>
 * Примеры:
 * "listen", "silent" → true
 * "triangle", "integral" → true
 * "apple", "papel" → true
 * "rat", "car" → false
 */
public class IsAnagram {

    // TODO: реализуй метод
    public static boolean isAnagram(String a, String b) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));   // → true
        System.out.println(isAnagram("apple", "papel"));     // → true
        System.out.println(isAnagram("rat", "car"));         // → false
    }
}
