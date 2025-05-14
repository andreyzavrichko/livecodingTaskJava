package org.example.strings;

/**
 * Задача: Сжатие строки
 * <p>
 * Условие:
 * Напиши метод, который сжимает строку, заменяя повторяющиеся символы
 * на символ и количество его повторений подряд.
 * Например: "aabcccccaaa" → "a2b1c5a3"
 * <p>
 * Если символ встречается один раз — всё равно добавляй его и 1.
 * Пробелы и регистр учитываются.
 * <p>
 * Примеры:
 * "aabcccccaaa" → "a2b1c5a3"
 * "abc" → "a1b1c1"
 * "aa AA" → "a2 1A2"
 */
public class CompressString {

    // TODO: реализуй метод ниже
    public static String compressString(String str) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        System.out.println(compressString("aa AA")); // → "a2 1A2"
    }
}
