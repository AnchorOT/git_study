package com.reflect.Myreflect3;

import java.lang.reflect.Field;

public class ReDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Class<?> Clazz = Class.forName("com.reflect.Myreflect3.ReStudent2");
        Field[] fields = Clazz.getFields();//public
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("\n");

        Field[] declaredFields = Clazz.getDeclaredFields();//all
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("\n");

        Field name = Clazz.getField("name");
        System.out.println(name);
        System.out.println("\n");

        Field money = Clazz.getDeclaredField("money");
        System.out.println(money);
    }
}
