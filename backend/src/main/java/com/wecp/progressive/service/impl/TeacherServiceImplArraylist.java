package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Teacher;

public class TeacherServiceImplArraylist  {
    List<Teacher> ls = new ArrayList<>();
    public List<Teacher> getAllTeachers(){
        return ls;
    }
    public Integer addTeacher(Teacher teacher){
        return -1;
    }
    public List<Teacher> getTeacherSortedByExperience(){
        return ls;
    }
    public void emptyArrayList(){
        
    }
}