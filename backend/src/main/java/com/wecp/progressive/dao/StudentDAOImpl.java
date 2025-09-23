package com.wecp.progressive.dao;

<<<<<<< HEAD
import java.sql.Connection;
=======
>>>>>>> afc97f7b36b352dd6efa7148b3246da178a44750
import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Course;
import com.wecp.progressive.entity.Student;

public class StudentDAOImpl implements StudentDAO{
<<<<<<< HEAD
    // Connection connection;
    public StudentDAOImpl(){

    }
    // public StudentDAOImpl(Connection connection){
    //     this.connection = connection;
    // }
=======

>>>>>>> afc97f7b36b352dd6efa7148b3246da178a44750
    @Override
    public int addStudent(Student student) {
        return -1;
    }

    @Override
    public void deleteStudent(int studentId) {

    }

    @Override
    public List<Student> getAllStudents() {
<<<<<<< HEAD
        //List<Student>ls = new ArrayList<>();
        return List.of();
=======
        List<Student>ls = new ArrayList<>();
        return ls;
>>>>>>> afc97f7b36b352dd6efa7148b3246da178a44750
    }

    @Override
    public Student getStudentById(int studentId) {
        return null;
    }

    @Override
    public void updateStudent(Student student) {
    }
    
}
