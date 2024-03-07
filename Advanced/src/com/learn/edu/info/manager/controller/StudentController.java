package com.learn.edu.info.manager.controller;

import com.learn.edu.info.manager.domain.Student;
import com.learn.edu.info.manager.service.StudentService;
import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class StudentController {
    private StudentService studentService = new StudentService();
    private Scanner sc = new Scanner(System.in);

    public void start() {

        //Scanner sc = new Scanner(System.in);
        studentLoop:
        while (true) {
            System.out.println("welcome to student manager system");
            System.out.println("请输入您的选择： 1.添加学生 2.删除学生 3.修改学生 4.查看学生 5.退出");
            System.out.println("welcome");
            String choice = sc.next();
            switch (choice) {
                case "1":
                    //System.out.println("添加");
                    addStudent();
                    break;
                case "2":
                    //System.out.println("删除");
                    deleteStudentById();
                    break;
                case "3":
                    //System.out.println("修改");
                    updateStudent();
                    break;
                case "4":
                    //System.out.println("查询");
                    findStudent();
                    break;
                case "5":
                    System.out.println("再见");
                    break studentLoop;
                default:
                    System.out.println("您的输入有误,请重新输入");
                    break;
            }
        }
    }

    public void updateStudent() {
        String updId=InputStudentId();
        Student newStu = InputStudentInfo(updId);
        studentService.updateStudent(updId,newStu);
    }

    public void deleteStudentById() {
        String delId= InputStudentId();
        studentService.deleteStudentById(delId);
        System.out.println("删除成功");
    }

    public void findStudent() {
        Student[] stus = studentService.findAllStudent();
        if (stus==null){
            System.out.println("查无信息，请添加后重试");
            return;
        }
            System.out.println("学号\t\t姓名\t\t年龄\t\t生日");
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if (stu!=null){
                System.out.println(stu.getId()+"\t"+stu.getName()+"\t\t"+stu.getAge()+"\t\t"+stu.getBirthday());
            }

        }
    }

    public void addStudent() {
        //StudentService studentService = new StudentService();
        //Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学生id：");
             id = sc.next();
            boolean flag = studentService.isExists(id);
            if (flag){
                System.out.println("学号已被占用，请重新输入");
            }
            else{
                //System.out.println("请输入学生id");
                break;
            }
        }
        Student stu= InputStudentInfo(id);
        boolean result = studentService.addStudent(stu);
        if (result) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
    }
    public String InputStudentId(){
        String Id;
        while(true) {
            System.out.println("请输入学生id");
            Id = sc.next();
            boolean exists = studentService.isExists(Id);
            if (!exists){
                System.out.println("你输入的id不存在，请重新输入");
            }
            else{
                break;
            }
        }
        return Id;
    }
    public Student InputStudentInfo(String id){
        System.out.println("请输入学生姓名：");
        String name = sc.next();
        System.out.println("请输入学生年龄：");
        String age = sc.next();
        System.out.println("请输入学生生日：");
        String birthday = sc.next();
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);
        return stu;
    }
}
