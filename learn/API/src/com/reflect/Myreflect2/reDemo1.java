package com.reflect.Myreflect2;

import java.lang.reflect.Constructor;

public class reDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
//        1. class中的forName("全类名")
//        全类名 包名+类名
        Class<?> aClass = Class.forName("com.reflect.Myreflect2.ReStudent1");
        Constructor<?>[] constructors = aClass.getConstructors();//Constructor<?>[] getConstructors() 返回所有公共构造方法的数组
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("\n");
        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();//Constructor<?>[] getDeclaredConstructors() 返回所有的构造方法的数组
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        System.out.println("\n");
        Constructor<?> constructor = aClass.getConstructor();//小括号要和构造方法形参保持一致 不能获取private构造方法
        System.out.println(constructor);
        System.out.println("\n");
        Constructor<?> constructor1 = aClass.getConstructor(String.class, int.class);
        System.out.println(constructor1);
        System.out.println("\n");


        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        System.out.println(declaredConstructor);


    }
}
