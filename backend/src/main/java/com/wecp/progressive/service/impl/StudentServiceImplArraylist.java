package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Student;

public class StudentServiceImplArraylist  {
    List<Student> ls = new ArrayList<>();
    public List<Student> getAllstudents(){
       return ls;
    }

    public Integer addStudent(Student student){
        return -1;
    }
    public List<Student> getAllStudentSortedByName(){
        return ls;
    }
    public void emptyArrayList(){
        
    }
}