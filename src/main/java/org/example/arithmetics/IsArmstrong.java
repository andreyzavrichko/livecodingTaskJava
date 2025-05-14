package org.example.arithmetics;

public class IsArmstrong {

    /**
     * Задача: Является ли число числом Армстронга
     *
     * Условие:
     * Число называется числом Армстронга, если сумма его цифр,
     * возведённых в степень количества цифр, равна самому числу.
     *
     * Примеры:
     * isArmstrong(153)  → true   // 1³ + 5³ + 3³ = 153
     * isArmstrong(9474) → true   // 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474
     * isArmstrong(123)  → false
     */

    // TODO: реализуй метод ниже
    public static boolean isArmstrong(int n) {
        // реализация здесь
        return false;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(isArmstrong(153));   // true
        System.out.println(isArmstrong(9474));  // true
        System.out.println(isArmstrong(123));   // false
    }
}
