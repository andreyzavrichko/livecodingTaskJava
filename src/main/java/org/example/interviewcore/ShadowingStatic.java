package org.example.interviewcore;

public class ShadowingStatic {
    static int x = 10;

    void method() {
        int x = 20;
        class Local {
            void print() {
                System.out.println("x = " + x);
                System.out.println("ShadowingStatic.x = " + ShadowingStatic.x);
            }
        }
        new Local().print();
    }

    public static void main(String[] args) {
        new ShadowingStatic().method();
    }
}
// Что выведет программа?


