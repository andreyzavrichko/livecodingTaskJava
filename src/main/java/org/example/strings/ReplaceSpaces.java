package org.example.strings;

/**
 * Задача: Замена пробелов на %20
 * <p>
 * Условие:
 * Напиши метод, который заменяет все пробелы в строке на "%20".
 * Начальные и конечные пробелы учитывать, ничего не обрезать.
 * Пробелы внутри строки тоже заменяются.
 * <p>
 * Примеры:
 * "Mr John Smith" → "Mr%20John%20Smith"
 * " Hello  " → "%20Hello%20%20"
 * "" → ""
 */
public class ReplaceSpaces {

    // TODO: реализуй метод
    public static String replaceSpaces(String str) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(replaceSpaces(" Hello  ")); // → "%20Hello%20%20"
    }
}
