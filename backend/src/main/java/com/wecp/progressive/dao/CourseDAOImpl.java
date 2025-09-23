package com.wecp.progressive.dao;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.entity.Course;

public class CourseDAOImpl implements CourseDAO{

<<<<<<< HEAD
    
    public CourseDAOImpl(){
        
    }
    
=======
>>>>>>> afc97f7b36b352dd6efa7148b3246da178a44750
    @Override
    public int addCourse(Course course) {
        return -1;
    }

    @Override
    public void deleteCourse(int courseId) {
        
    }

    @Override
    public List<Course> getAllCourses() {
        List<Course>ls = new ArrayList<>();
        return ls;
    }

    @Override
    public Course getCourseById(int courseId) {
        return null;
    }

    @Override
    public void updateCourse(Course course) {
        
    }
    
}
