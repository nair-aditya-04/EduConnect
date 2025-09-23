package com.wecp.progressive.dao;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Course;
import com.wecp.progressive.entity.Student;

public class StudentDAOImpl implements StudentDAO{
    // Connection connection;
    public StudentDAOImpl(){

    }
    // public StudentDAOImpl(Connection connection){
    //     this.connection = connection;
    // }
    @Override
    public int addStudent(Student student) {
        return -1;
    }

    @Override
    public void deleteStudent(int studentId) {

    }

    @Override
    public List<Student> getAllStudents() {
        //List<Student>ls = new ArrayList<>();
        return List.of();
    }

    @Override
    public Student getStudentById(int studentId) {
        return null;
    }

    @Override
    public void updateStudent(Student student) {
    }
    
}
