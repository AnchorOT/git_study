package com.set;

import com.domain.Student;

public class hashSet2 {
    public static void main(String[] args) {
        Student s1 = new Student("alice",22);
        Student s2 = new Student("tom",21);
//        在object类中根据地址值计算的哈希值。
        System.out.println(s1.hashCode());
        System.out.println(s1.hashCode());
//        对象不同哈希值不同
        System.out.println(s2.hashCode());
    }
}
