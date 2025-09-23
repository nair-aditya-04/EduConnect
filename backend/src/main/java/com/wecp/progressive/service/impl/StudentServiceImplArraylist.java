package com.wecp.progressive.service.impl;

import java.util.ArrayList;
<<<<<<< HEAD
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

=======
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
>>>>>>> afc97f7b36b352dd6efa7148b3246da178a44750
}