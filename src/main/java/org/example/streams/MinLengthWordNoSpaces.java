package org.example.streams;

import java.util.List;
import java.util.Optional;

public class MinLengthWordNoSpaces {

    /**
     * Задача: Найти слово с минимальной длиной (игнорируя пробелы)
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк и возвращает
     * слово с наименьшей длиной после удаления всех пробелов.
     * Если список пуст — вернуть Optional.empty().
     * <p>
     * Примеры:
     * minLengthWord(["a", "abc", "a b c"]) → Optional["a"]
     * minLengthWord([" a ", " b", ""])     → Optional[""]
     * minLengthWord([])                   → Optional.empty
     */

    // TODO: реализуй метод ниже
    public static Optional<String> minLengthWord(List<String> list) {
        // реализация здесь
        return Optional.empty();
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(minLengthWord(List.of("a", "abc", "a b c")));    // Optional[a]
        System.out.println(minLengthWord(List.of(" a ", " b", "")));       // Optional[]
        System.out.println(minLengthWord(List.of()));                      // Optional.empty
    }
}
