package com.set;

import com.domain.Student;

import java.util.TreeSet;

public class Treeset2 {
    public static void main(String[] args) {
        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("tom",18);
        Student s2 = new Student("alice",17);
        Student s3 = new Student("jerry",19);
        Student s4 = new Student("kevin",19);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        System.out.println(ts);
    }
}
