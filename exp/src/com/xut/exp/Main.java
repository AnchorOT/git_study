package com.xut.exp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Attendance {
    private String date;
    private String courseName;
    private String studentName;
    private String studentID;
    private String absenceType;

    public Attendance(String date, String courseName, String studentName, String studentID, String absenceType) {
        this.date = date;
        this.courseName = courseName;
        this.studentName = studentName;
        this.studentID = studentID;
        this.absenceType = absenceType;
    }

    public String getDate() {
        return date;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getAbsenceType() {
        return absenceType;
    }

    public void setAbsenceType(String absenceType) {
        this.absenceType = absenceType;
    }
}

class AttendanceManagementSystem {
    private List<Attendance> attendanceList;

    public AttendanceManagementSystem() {
        attendanceList = new ArrayList<>();
    }

    public void addAttendance(String date, String courseName, String studentName, String studentID, String absenceType) {
        Attendance attendance = new Attendance(date, courseName, studentName, studentID, absenceType);
        attendanceList.add(attendance);
        System.out.println("成功添加考勤记录。");
    }

    public void modifyAttendance(String studentID, String date, String absenceType) {
        for (Attendance attendance : attendanceList) {
            if (attendance.getStudentID().equals(studentID) && attendance.getDate().equals(date)) {
                attendance.setAbsenceType(absenceType);
                System.out.println("成功修改考勤记录。");
                return;
            }
        }
        System.out.println("未找到考勤记录。");
    }

    public void getAttendance(String studentID) {
        System.out.println("学生ID为 " + studentID + " 的考勤记录：");
        for (Attendance attendance : attendanceList) {
            if (attendance.getStudentID().equals(studentID)) {
                System.out.println("日期: " + attendance.getDate());
                System.out.println("课程: " + attendance.getCourseName());
                System.out.println("缺勤类型: " + attendance.getAbsenceType());
                System.out.println("--------------------");
            }
        }
    }

    public void deleteAttendance(String studentID, String date) {
        for (int i = 0; i < attendanceList.size(); i++) {
            Attendance attendance = attendanceList.get(i);
            if (attendance.getStudentID().equals(studentID) && attendance.getDate().equals(date)) {
                attendanceList.remove(i);
                System.out.println("成功删除考勤记录。");
                return;
            }
        }
        System.out.println("未找到考勤记录。");
    }

    public void displayAttendance() {
        System.out.println("考勤记录：");
        for (Attendance attendance : attendanceList) {
            System.out.println("日期: " + attendance.getDate());
            System.out.println("课程: " + attendance.getCourseName());
            System.out.println("学生姓名: " + attendance.getStudentName());
            System.out.println("学生ID: " + attendance.getStudentID());
            System.out.println("缺勤类型: " + attendance.getAbsenceType());
            System.out.println("--------------------");
        }
    }
}

public class Main {
    public static void main(String[]args) {
        AttendanceManagementSystem ams = new AttendanceManagementSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("考勤管理系统");
            System.out.println("1. 添加考勤记录");
            System.out.println("2. 修改考勤记录");
            System.out.println("3. 查询学生考勤情况");
            System.out.println("4. 删除考勤记录");
            System.out.println("5. 显示考勤记录");
            System.out.println("6. 退出");
            System.out.print("请输入您的选择：");
            choice = scanner.nextInt();
            scanner.nextLine(); // 消费换行符

            switch (choice) {
                case 1:
                    System.out.print("请输入日期：");
                    String date = scanner.nextLine();
                    System.out.print("请输入课程名称：");
                    String courseName = scanner.nextLine();
                    System.out.print("请输入学生姓名：");
                    String studentName = scanner.nextLine();
                    System.out.print("请输入学生ID：");
                    String studentID = scanner.nextLine();
                    System.out.print("请输入缺勤类型（迟到/早退/请假/旷课）：");
                    String absenceType = scanner.nextLine();
                    ams.addAttendance(date, courseName, studentName, studentID, absenceType);
                    break;
                case 2:
                    System.out.print("请输入学生ID：");
                    studentID = scanner.nextLine();
                    System.out.print("请输入日期：");
                    date = scanner.nextLine();
                    System.out.print("请输入新的缺勤类型（迟到/早退/请假/旷课）：");
                    absenceType = scanner.nextLine();
                    ams.modifyAttendance(studentID, date, absenceType);
                    break;
                case 3:
                    System.out.print("请输入学生ID：");
                    studentID = scanner.nextLine();
                    ams.getAttendance(studentID);
                    break;
                case 4:
                    System.out.print("请输入学生ID：");
                    studentID = scanner.nextLine();
                    System.out.print("请输入日期：");
                    date = scanner.nextLine();
                    ams.deleteAttendance(studentID, date);
                    break;
                case 5:
                    ams.displayAttendance();
                    break;
                case 6:
                    System.out.println("正在退出...");
                    break;
                default:
                    System.out.println("无效的选择，请重试。");
                    break;
            }

            System.out.println();
        } while (choice != 6);

        scanner.close();
    }
}

