package org.example.interviewcore;

public class ShortCircuit {
    public static void main(String[] args) {
        int x = 0;
        if (false && ++x > 0) {
            System.out.println("Inside");
        }
        System.out.println(x);
    }
}
// Почему x остаётся 0?