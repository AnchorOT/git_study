package com.learn.edu.info.manager.dao;

import com.learn.edu.info.manager.domain.Student;

public class StudentDao {
   private static Student[] stus = new Student[5];
    static {
        Student stu1 = new Student("000001", "张三","23","1999-01-11");
        Student stu2 = new Student("000002", "李四","24","2000-01-11");
        stus[0]=stu1;
        stus[1]=stu2;
    }
    public  boolean addStudent(Student stu) {
        int index = 1;
        for (int i = 0; i < stus.length; i++) {
            Student student = stus[i];
            if (student==null){
                index = i;
                break;
            }
        }
          if (index == -1){
              return false;
          }
          else {
              stus[index]=stu;
              return true;
          }
    }

    public Student[] findAllstudent() {
        return stus;
    }

    public void deleteStudentById(String delId) {
        int index = getIndex(delId);
        stus[index]= null;
    }
    public int getIndex(String id){
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if(stu != null && stu.getId().equals(id)){
                index = i;
                break;
            }
        }
        return index;
    }

    public void updateStudent(String updId, Student newStu) {
       int index=  getIndex(updId);
       stus[index]=newStu;
    }
}
