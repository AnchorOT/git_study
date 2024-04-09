package com.myanno.anno4;

import java.lang.reflect.Method;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> aClass = Class.forName("com.myanno.anno4.anStudent");
        boolean annotationPresent = aClass.isAnnotationPresent(Anno.class);
        System.out.println(annotationPresent);//ture 注解可继承

    }
}
