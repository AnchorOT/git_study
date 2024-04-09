package com.myenum;

public class enumDemo {
    public static void main(String[] args) {
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
        System.out.println("\n");

        Season spring= Season.SPRING;

        String name = Season.SPRING.name();//获取名称
        System.out.println(name);
        System.out.println("\n");
        int index1 = Season.SPRING.ordinal();
        int index2 = Season.SUMMER.ordinal();
        int index3 = Season.WINTER.ordinal();
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(index3);
        System.out.println("\n");
        int i = Season.SPRING.compareTo(Season.WINTER);//返回索引差值
        System.out.println(i);
        System.out.println("\n");
        String string = Season.SPRING.toString();
        System.out.println(string);
        System.out.println("\n");
        Season season = Enum.valueOf(Season.class, "SPRING");//获取指定枚举类的枚举项
        System.out.println(season==Season.SPRING);
        System.out.println("\n");
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value);
        }


    }
}
