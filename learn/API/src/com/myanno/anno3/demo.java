package com.myanno.anno3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class demo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> aClass = Class.forName("com.myanno.anno3.UseTest");
        Method[] declaredMethods = aClass.getDeclaredMethods();
        UseTest useTest = (UseTest) aClass.newInstance();
        for (Method declaredMethod : declaredMethods) {
            boolean annotationPresent = declaredMethod.isAnnotationPresent(Test.class);
            if (annotationPresent){
                declaredMethod.invoke(useTest);
            }
        }
    }
}
