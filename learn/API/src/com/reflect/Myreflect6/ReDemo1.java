package com.reflect.Myreflect6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> Clazz = Class.forName("com.reflect.Myreflect6.ReStudent3");
        Method function4 = Clazz.getMethod("function4", String.class);
        ReStudent3 student = (ReStudent3) Clazz.newInstance();
        Object alice = function4.invoke(student, "alice");
        System.out.println(alice);// return value


    }
}
