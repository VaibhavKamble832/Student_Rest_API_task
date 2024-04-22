package com.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.dto.Student;
import com.web.services.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentServices studentService;

    @PostMapping("/saveStudent")
    public String createStudent(@RequestBody Student student) {
    	studentService.saveNewStudent(student);
    	return "Student saved.";
    }

    @GetMapping("/studentList")
    public List<Student> getAllStudents() {
        return studentService.findAllStudents();
    }

    @GetMapping("/findStudent/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentService.findStudentById(id);
    }


    @PutMapping("/updateStudent/{id}")
    public String updateStudent(@PathVariable int id, @RequestBody Student student) {
        student.setId(id);
        studentService.saveNewStudent(student);
        return "Student is updated.";
    }

    @DeleteMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentService.deleteStudent(id);
        return "Student Deleted.";
    }
    
    
    
}