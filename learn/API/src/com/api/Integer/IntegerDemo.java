package com.api.Integer;

public class IntegerDemo {
    public static void main(String[] args) {
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1);
        System.out.println(i2);
        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf("200");
        System.out.println(i4);
        System.out.println(i3);
        Integer i5 = 100;//自动装箱 自动调用 valueof
        //自动拆箱 把一个包装类型 变为对应的基本数据类型
        //null 不能被转换
        int 下= i5;
        i5 =+ 200;
        System.out.println(i5);
    }
}
