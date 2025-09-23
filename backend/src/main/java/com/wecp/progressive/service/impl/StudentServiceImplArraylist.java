package com.wecp.progressive.service.impl;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Student;
import com.wecp.progressive.service.StudentService;

public class StudentServiceImplArraylist implements StudentService {
    private static List<Student> studentList = new ArrayList<>();
    public List<Student> getAllStudents(){
       return studentList;
    }

    public Integer addStudent(Student student){
        studentList.add(student);
        return studentList.size();
    }
    public List<Student> getAllStudentSortedByName(){
        Collections.sort(studentList);
        return studentList;
    }
    public void emptyArrayList(){
        studentList.clear();
    }
}