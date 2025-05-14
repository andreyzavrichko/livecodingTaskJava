package org.example.arithmetics;

public class LcmTask {

    /**
     * Задача: Наименьшее общее кратное (LCM)
     *
     * Условие:
     * Напиши два метода:
     * - метод `gcd(int a, int b)` — вычисляет наибольший общий делитель двух чисел
     * - метод `lcm(int a, int b)` — возвращает наименьшее общее кратное, используя формулу:
     *
     *      LCM(a, b) = (a * b) / GCD(a, b)
     *
     * Пример:
     * lcm(20, 30) → 60
     */

    // TODO: реализуй метод для НОД (gcd)
    public static int gcd(int a, int b) {
        // реализация здесь
        return 0;
    }

    // TODO: реализуй метод для НОК (lcm), используя gcd
    public static int lcm(int a, int b) {
        // реализация здесь
        return 0;
    }

    public static void main(String[] args) {
        // Примеры для запуска
        System.out.println(lcm(20, 30)); // 60
        System.out.println(lcm(15, 10)); // 30
        System.out.println(lcm(7, 3));   // 21
    }
}
