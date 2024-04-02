package com.threadatom2;

public class AtomDemo {
    public static void main(String[] args) {
        AtomThread atom = new AtomThread();
        for (int i = 0; i < 1000; i++) {
            new Thread(atom).start();
        }
    }
}
