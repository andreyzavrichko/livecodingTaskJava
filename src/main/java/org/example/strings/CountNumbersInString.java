package org.example.strings;

/**
 * Задача: Подсчёт чисел в строке
 * <p>
 * Условие:
 * Напиши метод, который считает, сколько отдельных чисел содержится в строке.
 * Число — это последовательность цифр, отделённая пробелами или символами.
 * <p>
 * Примеры:
 * "There are 2 apples and 15 bananas." → 2
 * "No numbers here" → 0
 * "2023 is the year, not 2024." → 2
 */
public class CountNumbersInString {

    // TODO: реализуй метод
    public static int countNumbers(String str) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(countNumbers("There are 2 apples and 15 bananas.")); // → 2
        System.out.println(countNumbers("No numbers here"));                    // → 0
        System.out.println(countNumbers("2023 is the year, not 2024."));        // → 2
    }
}
