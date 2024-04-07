package com.reflect.Myreflect2;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class reDemo2 {
    public static void main(String[] args) throws  ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> Clazz = Class.forName("com.reflect.Myreflect2.ReStudent1");
//        Constructor<?> constructor = Clazz.getConstructor(String.class, int.class);
////        构建学生对象
//        ReStudent student = (ReStudent) constructor.newInstance("alice", 23);
//        System.out.println(student);
////      无参构造
//        Constructor<?> constructor1 = Clazz.getConstructor();
//        ReStudent student1 = (ReStudent) constructor1.newInstance();
//        System.out.println(student1);
//
//        ReStudent s = (ReStudent) Clazz.newInstance();// 过时方法
//        System.out.println(s);
//        获取一个私有的构造方法
        Constructor<?> declaredConstructor = Clazz.getDeclaredConstructor();

//        被private修饰的成员，不能直接使用 如果用反射强行访问 要取消临时访问检查
        declaredConstructor.setAccessible(true);

        ReStudent1 student2 = (ReStudent1) declaredConstructor.newInstance();
        System.out.println(student2);
    }
}
