package com.wecp.progressive.service.impl;

<<<<<<< HEAD
//import java.sql.SQLException;
=======
<<<<<<< HEAD
//import java.sql.SQLException;
=======
import java.sql.SQLException;
>>>>>>> cdcd9f94628c8f7518b237e332762da0930cd856
>>>>>>> 709a1afcc404d621716b25220b70aa50a23bbfce
import java.util.ArrayList;
import java.util.List;

import com.wecp.progressive.dao.CourseDAO;
<<<<<<< HEAD
// import com.wecp.progressive.dao.CourseDAOImpl;
=======
<<<<<<< HEAD
// import com.wecp.progressive.dao.CourseDAOImpl;
=======
import com.wecp.progressive.dao.CourseDAOImpl;
>>>>>>> cdcd9f94628c8f7518b237e332762da0930cd856
>>>>>>> 709a1afcc404d621716b25220b70aa50a23bbfce
import com.wecp.progressive.entity.Course;
import com.wecp.progressive.service.CourseService;

public class CourseServiceImplJdbc implements CourseService {

    private CourseDAO courseDAO;
    
    public CourseServiceImplJdbc(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public Integer addCourse(Course course) {
        try
        {
            return courseDAO.addCourse(course);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
        
    }

    @Override
    public void deleteCourse(int courseId) {
        try
        {
            courseDAO.deleteCourse(courseId);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public List<Course> getAllCourses() {
        List<Course> li=new ArrayList<>();
        try
        {
            return courseDAO.getAllCourses();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
        
    }

    @Override
    public Course getCourseById(int courseId) {
        try
        {
            return courseDAO.getCourseById(courseId);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        return null;
       
    }

    @Override
    public void updateCourse(Course course) {
        try
        {
            courseDAO.updateCourse(course);   
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    

}