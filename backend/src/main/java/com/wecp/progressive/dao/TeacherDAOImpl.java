package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Course;
import com.wecp.progressive.entity.Teacher;

public class TeacherDAOImpl implements TeacherDAO{

<<<<<<< HEAD
    public TeacherDAOImpl(){
        
    }
=======
>>>>>>> afc97f7b36b352dd6efa7148b3246da178a44750
    @Override
    public int addTeacher(Teacher teacher) {
        return -1;
    }

    @Override
    public void deleteTeacher(int teacherId) {
        
    }

    @Override
    public List<Teacher> getAllTeachers() {
       List<Teacher>ls = new ArrayList<>();
       return ls;
    }

    @Override
    public Teacher getTeacherById(int teacherId) {
        return null;
    }

    @Override
    public void updateTeacher(Teacher teacher) {
        
    }
    
}
