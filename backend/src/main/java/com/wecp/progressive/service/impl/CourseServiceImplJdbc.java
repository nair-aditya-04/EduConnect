package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.CourseDAO;
import com.wecp.progressive.entity.Course;

public class CourseServiceImplJdbc{
    private CourseDAO courseDAO;
    
    public int addCourse(Course course) {
        courseDAO.addCourse(course);
        return -1;
    }

    public void deleteCourse(int courseId) {
        courseDAO.deleteCourse(courseId);
    }

    public List<Course> getAllCourses() {
        return courseDAO.getAllCourses();
    }

    public Course getCourseById(int courseId) {
        courseDAO.getCourseById(courseId);
        return null;
    }

    public void updateCourse(Course course) {
        
    }
}