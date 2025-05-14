package org.example.streams;

import java.util.List;

public class JoinNumbers {

    /**
     * Задача: Преобразовать список чисел в строку через дефис
     * <p>
     * Условие:
     * Напиши метод, который принимает список целых чисел
     * и возвращает одну строку, где числа соединены дефисом. Использовать Stream API.
     * <p>
     * Примеры:
     * joinWithDash([1, 2, 3]) → "1-2-3"
     * joinWithDash([10, 20]) → "10-20"
     * joinWithDash([])       → ""
     */

    // TODO: реализуй метод ниже
    public static String joinWithDash(List<Integer> list) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(joinWithDash(List.of(1, 2, 3)));   // "1-2-3"
        System.out.println(joinWithDash(List.of(10, 20)));    // "10-20"
        System.out.println(joinWithDash(List.of()));          // ""
    }
}
