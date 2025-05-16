package org.example.interviewcore;

import java.util.List;

public class NullListLoop {
    public static void main(String[] args) {
        List<String> list = null;
        for (String s : list) {
            System.out.println(s);
        }
    }
}
// Что произойдёт при запуске?

