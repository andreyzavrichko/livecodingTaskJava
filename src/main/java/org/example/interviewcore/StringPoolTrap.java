package org.example.interviewcore;

public class StringPoolTrap {
    public static void main(String[] args) {
        String a = "Java";
        String b = new String("Java");
        System.out.println(a == b);
        System.out.println(a.equals(b));
    }
}
// В чём разница между == и equals в данном случае?