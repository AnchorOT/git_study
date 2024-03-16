package com.collection;

import com.domain.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo7 {
    public static void main(String[] args) {
        ArrayList<Student> list= new ArrayList<>();
        Student s1 = new Student("小明",22);
        Student s2 = new Student("小z",24);
        Student s3 = new Student("小d",23);
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //迭代器
        Iterator<Student> it = list.iterator();
        while (it.hasNext()){
            Student s = it.next();
            System.out.println(s);
        }

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
