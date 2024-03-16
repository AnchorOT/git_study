package com.domain;

import com.exception.AgeOutBoundException;

import java.util.Objects;

public class Student implements Comparable<Student>{
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
        if (age>=18&&age<=25){
            this.age = age;
        }else{
            throw new AgeOutBoundException("overage");
        }

    }

    private String name;



    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
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

        Student student = (Student) o;

        if (age != student.age) return false;
        return Objects.equals(name, student.name);
    }
// 我们可以对object类中的hashcode方法重写 此时就与对象的地址值没有关系了。 可以根据对象的属性值重写 如果不同对象属性值一样，那么计算出来的哈希值也一样
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    //自然排序 优先使用 自定义comparable接口
    @Override
    public int compareTo(Student o) {
        int result = this.age - o.age;
        result=result == 0 ? this.name.compareTo(o.getName()):result;
        return result;
    }
}
