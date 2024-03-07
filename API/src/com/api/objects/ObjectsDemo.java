package com.api.objects;

import java.util.Objects;

public class ObjectsDemo {
    public static void main(String[] args) {
        Student s = new Student("张三",23);
        boolean result = Objects.isNull(s);
        boolean b = Objects.nonNull(s);
        System.out.println(result);
        System.out.println(b);
        String ss = Objects.toString(s, "no result");
        System.out.println(ss);
    }
}
