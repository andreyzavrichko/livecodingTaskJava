package org.example.collections;

import java.util.List;

public class FirstDuplicate {

    /**
     * Задача: Поиск первого повторяющегося элемента
     * <p>
     * Условие:
     * Напиши метод, который принимает список целых чисел
     * и возвращает первое число, которое встречается более одного раза.
     * Если повторяющихся нет — вернуть null.
     * <p>
     * Примеры:
     * firstDuplicate(List.of(1, 2, 3, 2, 4)) → 2
     * firstDuplicate(List.of(5, 1, 5, 2))   → 5
     * firstDuplicate(List.of(1, 2, 3, 4))   → null
     */

    // TODO: реализуй метод ниже
    public static Integer firstDuplicate(List<Integer> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(firstDuplicate(List.of(1, 2, 3, 2, 4, 1))); // 2
        System.out.println(firstDuplicate(List.of(5, 1, 5, 2)));       // 5
        System.out.println(firstDuplicate(List.of(1, 2, 3, 4)));       // null
    }
}
