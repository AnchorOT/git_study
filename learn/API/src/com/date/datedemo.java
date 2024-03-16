package com.date;

import java.util.Date;

public class datedemo {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);
        Date date2 = new Date(0L);
        System.out.println(date2);
        Date date3 = new Date(3600 * 1000);
        System.out.println(date3);
    }
}
