package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.TeacherDAO;
import com.wecp.progressive.entity.Course;
import com.wecp.progressive.entity.Student;
import com.wecp.progressive.entity.Teacher;
import com.wecp.progressive.service.TeacherService;

public class TeacherServiceImplJdbc  implements TeacherService{
    private TeacherDAO teacherDAO;
    
    
    public TeacherServiceImplJdbc(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }
    List<Teacher> ls = new ArrayList<>();
    public List<Teacher> getAllTeachers(){
        return teacherDAO.getAllTeachers();
    }
    public Integer addTeacher(Teacher teacher){
        return teacherDAO.addTeacher(teacher);
    }
    public List<Teacher> getTeacherSortedByExperience(){
         List<Teacher> list = new ArrayList<>();
        return list;
    }

    public void updateTeacher(Teacher teacher){

    }
    public void deleteTeacher(int teacherId){

    }
    public Teacher getTeacherById(int teacherId){
        return null;
    }
}