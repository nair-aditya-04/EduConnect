package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Student;
import com.wecp.progressive.service.impl.StudentServiceImplArraylist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServiceImplArraylist ssal;
    
    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        return new ResponseEntity<>(ssal.getAllStudents(),HttpStatus.OK);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable int studentId) {
        return new ResponseEntity<>(ssal.getStudentById(studentId),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Integer> addStudent(@RequestBody Student student) {
        return new ResponseEntity<>(ssal.addStudent(student),HttpStatus.OK);
    }

    @PutMapping("/{studentId}")
    public ResponseEntity<Void> updateStudent(@PathVariable int studentId, @RequestBody Student student) {
        //new ResponseEntity<>(ssal.updateStudent(student),HttpStatus.OK);
        ssal.updateStudent(student);
        return null;
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int studentId) {
        ssal.deleteStudent(studentId);
        return null;
    }

    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Student>> getAllStudentFromArrayList() {
        return new ResponseEntity<>(ssal.getAllStudents(),HttpStatus.OK);
        
    }

    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addStudentToArrayList(@RequestBody Student student) {
        return new ResponseEntity<>(ssal.addStudent(student),HttpStatus.CREATED);
        // return null;
    }

    @GetMapping("fromArrayList/sorted")
    public ResponseEntity<List<Student>> getAllStudentSortedByNameFromArrayList() {
        return new ResponseEntity<>(ssal.getAllStudentSortedByName(),HttpStatus.OK);
    }
}