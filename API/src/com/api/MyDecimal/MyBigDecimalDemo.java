package com.api.MyDecimal;

import java.math.BigDecimal;

public class MyBigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal bd1  = new BigDecimal(10.0);
        BigDecimal bd2  = new BigDecimal("0.3");
        BigDecimal bd3  = new BigDecimal("0.1");
        BigDecimal sum = bd3.add(bd2);
        BigDecimal subtract = bd2.subtract(bd3);//减法
        System.out.println(sum);
        System.out.println(subtract);
        System.out.println(bd1);
        System.out.println(bd2);
        BigDecimal divide = bd1.divide(bd2, 5,BigDecimal.ROUND_HALF_UP);//1 被除数 2 小数点后几位 3 舍入模式 进一发 去尾法 四舍五入
        System.out.println(divide);
    }
}
