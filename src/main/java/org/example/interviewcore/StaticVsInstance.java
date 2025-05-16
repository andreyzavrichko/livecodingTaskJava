package org.example.interviewcore;

public class StaticVsInstance {
    static int count = 0;
    int id = ++count;


    public static void main(String[] args) {
        StaticVsInstance a = new StaticVsInstance();
        StaticVsInstance b = new StaticVsInstance();
        System.out.println(a.id);
        System.out.println(b.id);
    }
}
// Что будет выведено?