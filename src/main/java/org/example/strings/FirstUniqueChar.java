package org.example.strings;

/**
 * Задача: Первый уникальный символ
 * <p>
 * Условие:
 * Найди первый символ в строке, который встречается только один раз.
 * Если такого символа нет — верни спецсимвол, например, пробел.
 * Учитывай регистр: 'A' и 'a' — разные символы.
 * <p>
 * Примеры:
 * "swiss" → 'w'
 * "aabbcc" → ' '
 * "Java" → 'J'
 */
public class FirstUniqueChar {

    // TODO: реализуй метод
    public static char firstUniqueChar(String str) {
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("swiss"));   // → 'w'
        System.out.println(firstUniqueChar("aabbcc"));  // → ' '
        System.out.println(firstUniqueChar("Java"));    // → 'J'
    }
}
