package com.wecp.progressive.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.CourseDAO;
import com.wecp.progressive.entity.Course;
<<<<<<< HEAD
import com.wecp.progressive.service.CourseService;

public class CourseServiceImplJdbc implements CourseService{
    private CourseDAO courseDAO;
    
    
    public CourseServiceImplJdbc(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    public Integer addCourse(Course course) {
        // courseDAO.addCourse(course);
=======

public class CourseServiceImplJdbc{
    private CourseDAO courseDAO;
    
    public int addCourse(Course course) {
        courseDAO.addCourse(course);
>>>>>>> afc97f7b36b352dd6efa7148b3246da178a44750
        return -1;
    }

    public void deleteCourse(int courseId) {
<<<<<<< HEAD
       // courseDAO.deleteCourse(courseId);
    }

    public List<Course> getAllCourses() {
        //return courseDAO.getAllCourses();
        List<Course> list = new ArrayList<>();
        return list;
    }

    public Course getCourseById(int courseId) {
        //courseDAO.getCourseById(courseId);
=======
        courseDAO.deleteCourse(courseId);
    }

    public List<Course> getAllCourses() {
        return courseDAO.getAllCourses();
    }

    public Course getCourseById(int courseId) {
        courseDAO.getCourseById(courseId);
>>>>>>> afc97f7b36b352dd6efa7148b3246da178a44750
        return null;
    }

    public void updateCourse(Course course) {
        
    }
}