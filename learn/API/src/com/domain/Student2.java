package com.domain;

import java.util.Objects;

public class Student2 implements Comparable<Student2>{
    private String name;
    private int age;

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student2() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student2 student = (Student2) o;

        if (age != student.age) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Student2 o) {
//        按照年龄 升序排序
        int result = this.getAge() - o.getAge();
//        按照姓名 升序排序
       result =  result== 0 ? this.getName().compareTo(o.getName()): result;
        return result;
    }
}
