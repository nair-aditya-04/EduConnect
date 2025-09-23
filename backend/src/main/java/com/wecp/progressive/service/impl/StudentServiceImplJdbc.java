package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.StudentDAO;
import com.wecp.progressive.entity.Student;

import com.wecp.progressive.service.StudentService;

public class StudentServiceImplJdbc implements StudentService{
    private StudentDAO studentDAO;
    

    public StudentServiceImplJdbc(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

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