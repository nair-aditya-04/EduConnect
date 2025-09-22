package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.wecp.progressive.entity.Teacher;

public class TeacherServiceImplArraylist  {
    List<Teacher> teacherList = new ArrayList<>();
    public List<Teacher> getAllTeachers(){
        return teacherList;
    }
    public Integer addTeacher(Teacher teacher){
        return -1;
    }
    public List<Teacher> getTeacherSortedByExperience(){
        Collections.sort(teacherList);
        return teacherList;
    }
    public void emptyArrayList(){
        teacherList.clear();
    }

}