package org.example.interviewcore;

public class SwitchFallthrough {
    public static void main(String[] args) {
        int x = 2;
        switch (x) {
            case 1:
                System.out.print("A");
            case 2:
                System.out.print("B");
            case 3:
                System.out.print("C");
                break;
            default:
                System.out.print("D");
        }
    }
}
// Что выведет программа? Почему?
