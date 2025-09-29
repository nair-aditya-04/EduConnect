package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Course;
import com.wecp.progressive.repository.CourseRepository;
import com.wecp.progressive.service.CourseService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    private final CourseRepository courseRepository;

    @Autowired
    CourseService courseService;

    CourseController(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }
    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses() throws Exception{
        // try
        // {
        //     return new ResponseEntity<>(courseService.getAllCourses(),HttpStatus.OK);
        // }
        // catch(RuntimeException e)
        // {
        //     return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        // }
        // catch(Exception ex){    
        //      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        // }
       if(!courseService.getAllCourses().isEmpty()){
            return new ResponseEntity<>(courseService.getAllCourses(),HttpStatus.OK);
       }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        
        
    }
    @GetMapping("/{courseId}")
    public ResponseEntity<Course> getCourseById(@PathVariable int courseId) throws Exception{
    //     try{
    //         return new ResponseEntity<>(courseService.getCourseById(courseId),HttpStatus.OK);
    //     }
    //     catch(RuntimeException e){
    //         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    //     }
    //     catch(Exception ex){    
    //         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    //    }
        if(courseService.getCourseById(courseId)!= null){
            return new ResponseEntity<>(courseService.getCourseById(courseId),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @PostMapping
    public ResponseEntity<Integer> addCourse(Course course) throws Exception{
    //     try{
    //         return new ResponseEntity<>(courseService.addCourse(course),HttpStatus.CREATED);
    //     }

    //     catch(RuntimeException e){
            
    //     }
    //     catch(Exception ex){    
    //         return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    //    }
        if(!courseService.getAllCourses().isEmpty()){
            return new ResponseEntity<>(courseService.addCourse(course),HttpStatus.CREATED);
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ResponseEntity<Void> updateCourse(int courseId, Course course) {
        return null;
    }

    public ResponseEntity<Void> deleteCourse(int courseId) {
        return null;
    }

    public ResponseEntity<List<Course>> getAllCourseByTeacherId(int teacherId) {
        return null;
    }
}
