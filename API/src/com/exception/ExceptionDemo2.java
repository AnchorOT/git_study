package com.exception;

import com.domain.Student;

import java.util.Scanner;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        s.setName(name);
        while(true) {
            System.out.println("请输入年龄");
            String ageStr = sc.nextLine();

            try {
                int age = Integer.parseInt(ageStr);
                s.setAge(age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("请输入一个整数");
                continue;
            }catch (AgeOutBoundException e) {
                System.out.println(e.toString());
                System.out.println("请输入符合要求的年龄");
                continue;
            }
        }
        System.out.println(s.toString());
    }
}
