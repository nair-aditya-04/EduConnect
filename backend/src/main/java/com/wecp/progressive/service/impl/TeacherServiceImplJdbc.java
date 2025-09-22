package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.TeacherDAO;
import com.wecp.progressive.entity.Student;
import com.wecp.progressive.entity.Teacher;

public class TeacherServiceImplJdbc  {
    private TeacherDAO teacherDAO;
    List<Teacher> ls = new ArrayList<>();
    public List<Teacher> getAllTeachers(){
        return teacherDAO.getAllTeachers();
    }
    public Integer addTeacher(Teacher teacher){
        return -1;
    }
    public List<Teacher> getTeacherSortedByExperience(){
        return ls;
    }

    public void updateTeacher(Teacher teacher){

    }
    public void deleteTeacher(int teacherId){

    }
    public Teacher getTeacherById(int teacherId){
        return null;
    }
}