package com.date;

import java.util.Date;

public class datedemo2 {
    public static void main(String[] args) {
        extracted();
        Date date1 = new Date();
        date1.setTime(0l);
        System.out.println(date1);
    }

    private static void extracted() {
        Date date1 = new Date();
//        .getTime显示时间的毫秒值 用作计算
        long time = date1.getTime();
        System.out.println(time);
        long time2 = System.currentTimeMillis();
        System.out.println(time2);
    }
}
