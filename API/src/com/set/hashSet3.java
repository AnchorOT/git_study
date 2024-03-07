package com.set;

import com.domain.Student;

import java.util.HashSet;

public class hashSet3 {
    public static void main(String[] args) {
        HashSet<Student>hashSet= new HashSet<>();
        Student s1 = new Student("eva",18);
        Student s2 = new Student("tom",20);
        Student s3 = new Student("alice",22);
        Student s4 = new Student("alice",22);
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);

        for (Student student : hashSet) {
            System.out.println(student);
        }
    }
}
