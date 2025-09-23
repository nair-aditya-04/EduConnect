package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.TeacherDAO;
<<<<<<< HEAD
import com.wecp.progressive.entity.Course;
import com.wecp.progressive.entity.Student;
import com.wecp.progressive.entity.Teacher;
import com.wecp.progressive.service.TeacherService;

public class TeacherServiceImplJdbc  implements TeacherService{
    private TeacherDAO teacherDAO;
    
    
    public TeacherServiceImplJdbc(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }
=======
import com.wecp.progressive.entity.Student;
import com.wecp.progressive.entity.Teacher;

public class TeacherServiceImplJdbc  {
    private TeacherDAO teacherDAO;
>>>>>>> afc97f7b36b352dd6efa7148b3246da178a44750
    List<Teacher> ls = new ArrayList<>();
    public List<Teacher> getAllTeachers(){
        return teacherDAO.getAllTeachers();
    }
    public Integer addTeacher(Teacher teacher){
<<<<<<< HEAD
        return teacherDAO.addTeacher(teacher);
    }
    public List<Teacher> getTeacherSortedByExperience(){
         List<Teacher> list = new ArrayList<>();
        return list;
=======
        return -1;
    }
    public List<Teacher> getTeacherSortedByExperience(){
        return ls;
>>>>>>> afc97f7b36b352dd6efa7148b3246da178a44750
    }

    public void updateTeacher(Teacher teacher){

    }
    public void deleteTeacher(int teacherId){

    }
    public Teacher getTeacherById(int teacherId){
        return null;
    }
}