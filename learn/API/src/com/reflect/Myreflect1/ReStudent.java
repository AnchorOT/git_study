package com.reflect.Myreflect1;

public class ReStudent {
    private String name;
    private int age;

    public ReStudent() {
    }

    public ReStudent(String name, int age) {
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
    public void study(){
        System.out.println("study");
    }

    @Override
    public String toString() {
        return "ReStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
