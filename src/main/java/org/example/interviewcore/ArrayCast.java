package org.example.interviewcore;

public class ArrayCast {
    public static void main(String[] args) {
        Object o = new int[] {1, 2, 3};
        System.out.println(((int[]) o)[1]);
    }
}
// Как работает приведение массивов?
