package org.example.interviewcore;

public class FinallyOverride {
    public static void main(String[] args) {
        System.out.println(test());
    }

    static int test() {
        try {
            return 1;
        } finally {
            return 2;
        }
    }
}
// Что будет выведено?