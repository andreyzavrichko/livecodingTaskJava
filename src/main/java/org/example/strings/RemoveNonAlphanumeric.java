package org.example.strings;

/**
 * Задача: Удаление всех символов, кроме букв и цифр
 * <p>
 * Условие:
 * Напиши метод, который удаляет из строки все символы,
 * кроме латинских букв и цифр. Пробелы, знаки, спецсимволы — удаляются.
 * <p>
 * Примеры:
 * "Hello, World! 123" → "HelloWorld123"
 * "Test@#2024" → "Test2024"
 * "!@#$%" → ""
 */
public class RemoveNonAlphanumeric {

    // TODO: реализуй метод
    public static String removeNonAlphanumeric(String str) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(removeNonAlphanumeric("Hello, World! 123")); // → "HelloWorld123"
        System.out.println(removeNonAlphanumeric("Test@#2024")); // → "Test2024"
        System.out.println(removeNonAlphanumeric("!@#$%")); // → ""
    }
}
