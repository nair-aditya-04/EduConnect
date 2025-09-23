package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.CourseDAO;
import com.wecp.progressive.entity.Course;
import com.wecp.progressive.service.CourseService;

public class CourseServiceImplJdbc implements CourseService{
    private CourseDAO courseDAO;
    
    
    public CourseServiceImplJdbc(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    public Integer addCourse(Course course) {
        // courseDAO.addCourse(course);

        return -1;
    }

    public void deleteCourse(int courseId) {
       // courseDAO.deleteCourse(courseId);
    }

    public List<Course> getAllCourses() {
        //return courseDAO.getAllCourses();
        List<Course> list = new ArrayList<>();
        return list;
    }

    public Course getCourseById(int courseId) {
        //courseDAO.getCourseById(courseId);

        return null;
    }

    public void updateCourse(Course course) {
        
    }
}