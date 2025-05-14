package org.example.strings;

/**
 * Задача: Расжатие строки
 * <p>
 * Условие:
 * Напиши метод, который принимает строку в сжатом формате
 * (символ + количество повторений) и восстанавливает её в исходный вид.
 * <p>
 * Примеры:
 * "a2b1c5a3" → "aabcccccaaa"
 * "x1y2z3" → "xyyzzz"
 * "a1" → "a"
 * <p>
 * Условия:
 * – Гарантируется, что формат корректен.
 * – Количество всегда указано одной или несколькими цифрами после символа.
 */
public class ExpandString {

    // TODO: реализуй метод
    public static String expandString(String str) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(expandString("a2b1c5a3")); // → "aabcccccaaa"
        System.out.println(expandString("x1y2z3"));   // → "xyyzzz"
        System.out.println(expandString("a1"));       // → "a"
    }
}
