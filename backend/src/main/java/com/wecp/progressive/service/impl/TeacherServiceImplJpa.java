package com.wecp.progressive.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.wecp.progressive.entity.Teacher;
import com.wecp.progressive.exception.CourseNotFoundException;
import com.wecp.progressive.exception.TeacherAlreadyExistsException;
import com.wecp.progressive.repository.CourseRepository;
import com.wecp.progressive.repository.TeacherRepository;
import com.wecp.progressive.service.TeacherService;

@Service
public class TeacherServiceImplJpa implements TeacherService {

    private final CourseRepository courseRepository;
    TeacherRepository teacherRepository;
    
    public TeacherServiceImplJpa(TeacherRepository teacherRepository, CourseRepository courseRepository) {
        this.teacherRepository = teacherRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public Integer addTeacher(Teacher teacher) throws Exception {
        Integer t = teacher.getTeacherId();
       if(t != null){
        if(teacherRepository.findById(teacher.getTeacherId()).get() !=null){
            throw new TeacherAlreadyExistsException("id not found");
           }
           return teacherRepository.save(teacher).getTeacherId();
       }
       return null;
    }

    @Override
    public List<Teacher> getAllTeachers() throws Exception {
        return teacherRepository.findAll();
    }
    public Teacher getTeacherById(int teacherId) throws Exception
    {
        return teacherRepository.findById(teacherId).get();
    }
    public void deleteTeacher(int teacherId)throws Exception
    {
        teacherRepository.deleteById(teacherId);
    }

    @Override
    public List<Teacher> getTeacherSortedByExperience() throws Exception {
        List<Teacher> sortedList= teacherRepository.findAll();
        Collections.sort(sortedList);
        return sortedList;
    }
    public void updateTeacher(Teacher teacher) throws Exception
    {
        if(teacherRepository.findById(teacher.getTeacherId()).get()!=null)
        {
            teacherRepository.save(teacher);
        }
        else
        {
            throw new Exception("Teacher not found");
        }
    }
    


}