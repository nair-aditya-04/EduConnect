package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.StudentDAO;
import com.wecp.progressive.entity.Student;
<<<<<<< HEAD
import com.wecp.progressive.service.StudentService;

public class StudentServiceImplJdbc implements StudentService{
    private StudentDAO studentDAO;
    

    public StudentServiceImplJdbc(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }
=======

public class StudentServiceImplJdbc  {
    private StudentDAO studentDAO;

>>>>>>> afc97f7b36b352dd6efa7148b3246da178a44750
    public List<Student> getAllStudents(){
        return studentDAO.getAllStudents();
    }
    public Integer addStudent(Student student){
        return studentDAO.addStudent(student);
    }

    public List<Student> getAllStudentSortedByName(){
       List<Student> ls = new ArrayList<>();
       return ls;
    }

    public void updateStudent(Student student){

    }

    public void deleteStudent(int studentId){

    }
    public Student getStudentById(int studentId){
        return null;
    }
}