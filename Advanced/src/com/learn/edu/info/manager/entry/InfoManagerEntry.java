package com.learn.edu.info.manager.entry;

import com.learn.edu.info.manager.controller.StudentController;

import java.util.Scanner;

public class InfoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("welcome");
            System.out.println("请输入您的选择：1.学生管理系统 2.老师管理系统 3.退出");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    System.out.println("学生管理");
                    StudentController studentController = new StudentController();
                    studentController.start();
                    break;
                case "2":
                    System.out.println("老师管理");
                    break;
                case "3":
                    System.out.println("感谢您的使用");
                    System.exit(0);
                    break;
                default:
                    System.out.println("您的输入有误请重新输入");
                    break;
            }
        }
    }
}
