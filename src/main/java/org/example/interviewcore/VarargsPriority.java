package org.example.interviewcore;

public class VarargsPriority {
    public static void main(String[] args) {
        // print(null); // раскомментировать строку перед выполнением
    }

    static void print(String s) {
        System.out.println("String");
    }

    static void print(Object... o) {
        System.out.println("Object...");
    }
}
// Какой метод вызовется? Почему?
