package com.xut.exp;

public class student {
    private int number;
    private int age;
    private String name;

    public student(int number, int age, String name) {
        this.number = number;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    public void increaseAge() {
        age++;
    }

    public static void main(String[] args) {
        student[] students = new student[]{
                new student(1, 19, "张三"),
                new student(2, 20, "李四"),
                new student(3, 18, "小明")
        };
        for (student s : students) {
            s.increaseAge();
        }
        for (student s : students) {
            System.out.println("学号: " + s.getNumber() + ",姓名: " + s.getName() + "年龄: " + s.getAge());
        }
        System.out.println("年龄大于20岁的有：");
        for (student i : students) {
            if (i.getAge() > 20) {
                System.out.println(i.getName());
            }
        }
    }
}
