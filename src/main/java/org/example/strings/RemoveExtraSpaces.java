package org.example.strings;

/**
 * Задача: Удаление повторяющихся пробелов
 * <p>
 * Условие:
 * Напиши метод, который заменяет все подряд идущие пробелы
 * на один. Начальные и конечные пробелы сохраняются без изменений.
 * <p>
 * Примеры:
 * "Hello   world" → "Hello world"
 * "  This    is   a test  " → "  This is a test  "
 * "NoExtraSpaces" → "NoExtraSpaces"
 */
public class RemoveExtraSpaces {

    // TODO: реализуй метод
    public static String removeExtraSpaces(String str) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(removeExtraSpaces("Hello   world")); // → "Hello world"
        System.out.println(removeExtraSpaces("  This    is   a test  ")); // → "  This is a test  "
        System.out.println(removeExtraSpaces("NoExtraSpaces")); // → "NoExtraSpaces"
    }
}
