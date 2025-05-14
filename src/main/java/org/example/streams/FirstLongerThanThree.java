package org.example.streams;

import java.util.List;
import java.util.Optional;

public class FirstLongerThanThree {

    /**
     * Задача: Найти первое слово длиннее 3 символов
     * <p>
     * Условие:
     * Напиши метод, который принимает список строк
     * и возвращает первое слово длиной более 3 символов, используя Stream API.
     * Если такого нет — вернуть Optional.empty().
     * <p>
     * Примеры:
     * firstLongerThanThree(["a", "ab", "hello", "hi"]) → Optional["hello"]
     * firstLongerThanThree(["a", "bb", "cc"])          → Optional.empty
     */

    // TODO: реализуй метод ниже
    public static Optional<String> firstLongerThanThree(List<String> list) {
        // реализация здесь
        return Optional.empty();
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(firstLongerThanThree(List.of("a", "ab", "hello", "hi"))); // Optional[hello]
        System.out.println(firstLongerThanThree(List.of("a", "bb", "cc")));          // Optional.empty
    }
}
