package org.example.strings;

/**
 * Задача: Подсчёт количества слов в строке
 * <p>
 * Условие:
 * Напиши метод, который возвращает количество слов в строке.
 * Слова разделяются пробелами. Пробелов может быть несколько подряд.
 * Пустая строка или строка из пробелов — даёт 0.
 * <p>
 * Примеры:
 * "Hello world" → 2
 * "   One   two  three  " → 3
 * "" → 0
 */
public class CountWords {

    // TODO: реализуй метод
    public static int countWords(String str) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Hello world"));             // → 2
        System.out.println(countWords("   One   two  three  "));   // → 3
        System.out.println(countWords(""));                        // → 0
    }
}
