package org.example.collections;

import java.util.List;

public class RemoveByAnotherList {

    /**
     * Задача: Удаление элементов из списка по другому списку
     * <p>
     * Условие:
     * Напиши метод, который принимает два списка строк и возвращает
     * новый список, в котором из первого удалены все элементы, содержащиеся во втором.
     * Порядок элементов должен сохраняться.
     * <p>
     * Примеры:
     * removeByList(["a", "b", "c"], ["b", "c"]) → ["a"]
     * removeByList(["x", "y", "z"], ["z"])      → ["x", "y"]
     * removeByList(["one"], [])                → ["one"]
     */

    // TODO: реализуй метод ниже
    public static List<String> removeByList(List<String> list1, List<String> list2) {
        // реализация здесь
        return null;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(removeByList(List.of("a", "b", "c"), List.of("b", "c"))); // [a]
        System.out.println(removeByList(List.of("x", "y", "z"), List.of("z")));      // [x, y]
        System.out.println(removeByList(List.of("one"), List.of()));                // [one]
    }
}
