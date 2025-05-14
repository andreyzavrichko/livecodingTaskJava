package org.example.strings;

/**
 * Задача: Удаление всех цифр из строки
 * <p>
 * Условие:
 * Напиши метод, который удаляет все цифры из строки.
 * Остальные символы остаются без изменений.
 * <p>
 * Примеры:
 * "abc123" → "abc"
 * "1a2b3c" → "abc"
 * "456" → ""
 */
public class RemoveDigits {

    // TODO: реализуй метод
    public static String removeDigits(String str) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(removeDigits("abc123")); // → "abc"
        System.out.println(removeDigits("1a2 b3c")); // → "abc"
        System.out.println(removeDigits("456")); // → ""
    }
}
