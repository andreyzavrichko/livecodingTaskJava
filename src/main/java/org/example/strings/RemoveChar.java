package org.example.strings;

/**
 * Задача: Удаление всех вхождений символа
 * <p>
 * Условие:
 * Напиши метод, который удаляет из строки все вхождения заданного символа.
 * Учитывай регистр. Исходную строку не изменяй.
 * <p>
 * Примеры:
 * ("hello", 'l') → "heo"
 * ("Java", 'a') → "Jv"
 * ("Test", 'T') → "est"
 */
public class RemoveChar {

    // TODO: реализуй метод
    public static String removeChar(String str, Character symbol) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(removeChar("hello", 'l')); // → "heo"
        System.out.println(removeChar("Java", 'a'));  // → "Jv"
        System.out.println(removeChar("Test", 'T'));  // → "est"
    }
}
