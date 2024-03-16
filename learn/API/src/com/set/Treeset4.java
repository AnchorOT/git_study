package com.set;

import com.domain.Teacher;

import java.util.Comparator;
import java.util.TreeSet;

public class Treeset4 {
    public static void main(String[] args) {
        //比较器排序
        TreeSet<Teacher> ts =new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                //o1是要存入的元素 o2是已经存入的元素
                int result = o1.getAge() - o2.getAge();
                result=result == 0? o1.getName().compareTo(o2.getName()):result;
                return result;
            }
        });
        Teacher t1 = new Teacher("alice",21);
        Teacher t2 = new Teacher("tom",23);
        Teacher t3 = new Teacher("lisa",26);
        Teacher t4 = new Teacher("pre",26);
        ts.add(t1);
        ts.add(t2);
        ts.add(t3);
        ts.add(t4);
        System.out.println(ts);
    }
}
