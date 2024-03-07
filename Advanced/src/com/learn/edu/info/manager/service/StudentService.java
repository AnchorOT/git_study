package com.learn.edu.info.manager.service;

import com.learn.edu.info.manager.dao.StudentDao;
import com.learn.edu.info.manager.domain.Student;

public class StudentService {
   private StudentDao studentDao = new StudentDao();
   public boolean addStudent(Student stu){
       return studentDao.addStudent(stu);
    }
    public boolean  isExists(String id) {
       Student[] stus = studentDao.findAllstudent();
       boolean exists = false;
        for (int i = 0; i < stus.length; i++) {
            Student student =stus[i];
            if (student != null && student.getId().equals(id)){
                exists = true;
                break;
            }
        }
        return exists;
    }

    public Student[] findAllStudent() {
        Student[] allstudent = studentDao.findAllstudent();
        boolean flag =false;
        for (int i = 0; i < allstudent.length; i++) {
            Student stu = allstudent[i];
            if (stu != null){
                flag = true;
                break;
            }
        }
        if (flag){
            return allstudent;
        }
        else {
            return null;
        }
    }

    public void deleteStudentById(String delId) {
       studentDao.deleteStudentById(delId);

    }

    public void updateStudent(String updId, Student newStu) {
       studentDao.updateStudent(updId,newStu);
    }
}
