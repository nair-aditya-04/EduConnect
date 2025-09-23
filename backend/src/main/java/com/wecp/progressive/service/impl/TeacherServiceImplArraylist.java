package com.wecp.progressive.service.impl;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.Collections;
=======
>>>>>>> afc97f7b36b352dd6efa7148b3246da178a44750
import java.util.List;

import com.wecp.progressive.entity.Teacher;

public class TeacherServiceImplArraylist  {
<<<<<<< HEAD
    private static List<Teacher> teacherList = new ArrayList<>();
    public List<Teacher> getAllTeachers(){
        return teacherList;
    }
    public Integer addTeacher(Teacher teacher){
        teacherList.add(teacher);
        return teacherList.size();
    }
    public List<Teacher> getTeacherSortedByExperience(){
        Collections.sort(teacherList);
        return teacherList;
    }
    public void emptyArrayList(){
        teacherList.clear();
    }

=======
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
>>>>>>> afc97f7b36b352dd6efa7148b3246da178a44750
}