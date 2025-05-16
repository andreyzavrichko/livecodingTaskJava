package org.example.interviewcore;

public class NullCatch {
    public static void main(String[] args) {
        String s = null;
        try {
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getClass().getSimpleName());
        }
    }
}
// Что будет напечатано?