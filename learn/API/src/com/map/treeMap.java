package com.map;

import com.domain.Student2;

import javax.xml.transform.Result;
import java.util.Comparator;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<Student2,String> tm= new TreeMap<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                int result = o2.getAge() - o1.getAge();
                 result = result == 0 ? o2.getName().compareTo(o1.getName()) : result;
                return result;
            }
        });
        Student2 s1 = new Student2("tom",18);
        Student2 s2 = new Student2("alice",17);
        Student2 s3 = new Student2("jerry",19);
        Student2 s4 = new Student2("kevin",19);
        tm.put(s1,"beijing");
        tm.put(s2,"shanghai");
        tm.put(s3,"tianjin");
        tm.put(s4,"xi'an");
        tm.forEach(
                (Student2 s ,String value)->{
                    System.out.println(s+"---"+value);
                }
        );
    }
}
