package org.example.interviewcore;

public class FinalParameter {
    public static void main(String[] args) {
        final int[] arr = {1, 2, 3};
        modify(arr);
        System.out.println(arr[0]);
    }

    static void modify(final int[] array) {
        array[0] = 99;
    }
}
// Изменится ли массив? Почему?