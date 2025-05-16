package org.example.interviewcore;

public class StaticInitOrder {
    static int a = 5;

    static {
        a = a + 10;
    }

    public static void main(String[] args) {
        System.out.println(a);
    }
}
// В каком порядке инициализируются переменные и блоки?