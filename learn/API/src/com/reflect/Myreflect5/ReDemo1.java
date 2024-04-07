package com.reflect.Myreflect5;

import java.lang.reflect.Method;

public class ReDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> Clazz = Class.forName("com.reflect.Myreflect5.ReStudent3");
        Method[] methods = Clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("\n");
        Method[] declaredMethods = Clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
        System.out.println("\n");
        Method function1 = Clazz.getMethod("function1");
        System.out.println(function1);

        Method function2 = Clazz.getMethod("function2", String.class);
        System.out.println(function2);
        System.out.println("\n");
        Method show = Clazz.getDeclaredMethod("show");
        System.out.println(show);
    }
}
