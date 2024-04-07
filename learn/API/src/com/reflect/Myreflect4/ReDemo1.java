package com.reflect.Myreflect4;

import java.lang.reflect.Field;

public class ReDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<?> Clazz = Class.forName("com.reflect.Myreflect4.ReStudent2");
        ReStudent2 student = (ReStudent2) Clazz.newInstance();
        Field name = Clazz.getField("name");
        name.set(student,"alice");
        System.out.println(student);
        System.out.println("\n");

        Field money = Clazz.getDeclaredField("money");
        money.setAccessible(true);
        Object o = money.get(student);
        System.out.println(o);
        System.out.println("\n");
    }
}
