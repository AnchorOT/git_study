package com.xut.exp;

import java.util.Random;

public class pout {
    public static void main(String[] args) {

       Random a= new Random();
        for (int i = 0; i < 10; i++) {
            int b= a.nextInt(100);
            System.out.println(b);
        }


    }
}
