<<<<<<< HEAD
package com.wecp.progressive.controller;
 
import com.wecp.progressive.entity.Student;
import com.wecp.progressive.repository.StudentRepository;
import com.wecp.progressive.service.StudentService;
import com.wecp.progressive.service.impl.StudentServiceImplArraylist;
import com.wecp.progressive.service.impl.StudentServiceImplJpa;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
import java.util.List;
 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
 
 
 
 
@RestController
@RequestMapping("/student")
public class StudentController {
 
@Autowired
private StudentServiceImplArraylist studentServiceImplArraylist;
// @Autowired
// private StudentServiceImplJpa studentServiceImplJpa;
@Autowired
private StudentService studentService;
@GetMapping
    public ResponseEntity<List<Student>> getAllStudents()  {
        return new ResponseEntity<>(studentServiceImplArraylist.getAllStudents(),HttpStatus.OK);
    }
//     @GetMapping("/{studentId}")
// public String getMethodName(@RequestParam String param) {
//     return new String();
// }
@GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable int studentId) throws Exception{
        return new ResponseEntity<>(studentService.getStudentById(studentId),HttpStatus.OK);
    }
// @PostMapping
// public String postMethodName(@RequestBody String entity) {
   
//     return entity;
// }
 
public String postMethodName(@RequestBody String entity) {
    //TODO: process POST request
   
    return entity;
}
@PostMapping
    public ResponseEntity<Integer> addStudent( @RequestBody Student student) throws Exception {
      Integer result= studentService.addStudent(student);
       
        return new ResponseEntity<>(result ,HttpStatus.CREATED);
       
    }
    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Student>> getAllStudentFromArrayList() {
 
         return new ResponseEntity<>(studentServiceImplArraylist.getAllStudents(),HttpStatus.CREATED);
    }
 
// public String getMethodName(@RequestParam String param) {
//     return new String();
// }
@GetMapping("/fromArrayList/sorted")
    public ResponseEntity<List<Student>> getAllStudentSortedByNameFromArrayList() throws Exception {
        return new ResponseEntity<>(studentServiceImplArraylist.getAllStudentSortedByName(),HttpStatus.CREATED);
  }
    // @PutMapping("/{studentId}")
    // public String putMethodName(@PathVariable String id, @RequestBody String entity) {
    //     //TODO: process PUT request
       
    //     return entity;
    // }
    @PutMapping("/{studentId}")
    public ResponseEntity<Void> updateStudent(@PathVariable int studentId, @RequestBody Student student) throws Exception{
        studentService.updateStudent(student);
        return new ResponseEntity<>(HttpStatus.OK);
     
    }
    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int studentId) throws Exception{
        studentService.deleteStudent(studentId);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
 
 
    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }
   
 
    // @GetMapping("/toArrayList")
    // public String getMethodName(@RequestParam String param) {
    //     return new String();
    // }
    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addStudentToArrayList(@RequestBody Student student) {
       return new ResponseEntity<>(studentServiceImplArraylist.addStudent(student),HttpStatus.CREATED);
    }
// @GetMapping()
// public String getMethodName(@RequestParam String param) {
//     return new String();
// }
 
   
=======
package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Student;
import com.wecp.progressive.service.StudentService;
import com.wecp.progressive.service.impl.StudentServiceImplArraylist;
import com.wecp.progressive.service.impl.StudentServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    private StudentServiceImplJpa studentServiceImplJpa;

    @Autowired
    private StudentServiceImplArraylist studentServiceImplArraylist;
    

   

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getAllStudents() throws Exception {
        return new ResponseEntity<>(studentServiceImplJpa.getAllStudents(), HttpStatus.OK);
    }
  
    @GetMapping("/student/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable int studentId) {
        try {
            return new ResponseEntity<>(studentServiceImplJpa.getStudentById(studentId),HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @PostMapping("/student")
    public ResponseEntity<Integer> addStudent(@RequestBody Student student) {
        try {
            return new ResponseEntity<>(studentServiceImplJpa.addStudent(student),HttpStatus.CREATED);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

    @PutMapping("/student/{studentId}")
    public ResponseEntity<Void> updateStudent(@PathVariable int studentId, @RequestBody Student student) {
        // Student stu;
        try {
            studentServiceImplJpa.updateStudent(student);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/student/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable int studentId) {
        studentServiceImplJpa.deleteStudent(studentId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }

    @GetMapping("/student/fromArrayList")
    public ResponseEntity<List<Student>> getAllStudentFromArrayList() throws Exception {
        return new ResponseEntity<>(studentServiceImplArraylist.getAllStudents(),HttpStatus.OK);
    }

    @PostMapping("/student/toArrayList")
    public ResponseEntity<Integer> addStudentToArrayList(@RequestBody Student student) throws Exception {
        return new ResponseEntity<>(studentServiceImplArraylist.addStudent(student),HttpStatus.CREATED);
    }

    @GetMapping("/student/fromArrayList/sorted")
    public ResponseEntity<List<Student>> getAllStudentSortedByNameFromArrayList() throws Exception {
        return new ResponseEntity<>(studentServiceImplArraylist.getAllStudentSortedByName(),HttpStatus.OK);
    }
>>>>>>> aded839ee546cd3f1352e0b1340b17be457d4484
}