package com.reflect.Myreflect1;

public class reDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
//        1. class中的forName("全类名")
//        全类名 包名+类名
        Class<?> aClass = Class.forName("com.reflect.Myreflect1.ReStudent");
        System.out.println(aClass);
//        2.通过class属性来获取
        Class<ReStudent> aClass1 = ReStudent.class;
        System.out.println(aClass1);
//        3.利用对象的getClass方法来获得class对象
//        getClass对象是定义在Object类中的
        ReStudent student = new ReStudent();
        Class aClass2 = student.getClass();
        System.out.println(aClass2);

    }
}
