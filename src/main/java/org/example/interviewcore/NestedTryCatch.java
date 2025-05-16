package org.example.interviewcore;

public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            try {
                throw new NullPointerException();
            } catch (ArithmeticException e) {
                System.out.println("Inner catch");
            } finally {
                System.out.println("Inner finally");
            }
        } catch (Exception e) {
            System.out.println("Outer catch");
        }
    }
}
// Определи порядок вывода.
