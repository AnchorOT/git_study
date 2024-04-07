package com.reflect.Myreflect2;

public class ReStudent1 {
    private String name;
    private int age;

    public ReStudent1() {
        System.out.println("public restudent 无参构造");
    }

    private ReStudent1(String name) {
        System.out.println(name);
        System.out.println("private restudent 有参构造");
    }

    public ReStudent1(String name, int age) {
        System.out.println(name+"    "+age);
        System.out.println("public restudent 有参构造");
    }

    @Override
    public String toString() {
        return "ReStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
