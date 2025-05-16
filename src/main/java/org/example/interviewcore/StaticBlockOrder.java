package org.example.interviewcore;

public class StaticBlockOrder {
    static {
        System.out.println("Static block");
    }

    public StaticBlockOrder() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new StaticBlockOrder();
    }
}
// В каком порядке выполняется код?